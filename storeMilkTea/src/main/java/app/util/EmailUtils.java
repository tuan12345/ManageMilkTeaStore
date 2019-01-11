package app.util;

import freemarker.template.Configuration;
import org.apache.log4j.Logger;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.ui.velocity.VelocityEngineUtils;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

public class EmailUtils {
    private static final Logger logger = Logger.getLogger(EmailUtils.class);

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private VelocityEngine velocityEngine;

    @Autowired
    private Configuration freemarkerConfiguration;

    @Value("${spring.mail.form}")
    private String emailForm;

    public void sendConfirmationEmail(final String email, final String token, WebRequest request) {
        this.mailSender.send((mimeMessage) -> {
            MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
            message.setSubject("Verify email.");
            message.setTo(email);
            message.setFrom(emailForm);
            Map<String, Object> model = new HashMap<>();
            model.put("actionUrl", request.getHeader("Origin") + "/users/registrationConfirm?token=" + token);
            String text = geFreeMarkerTemplateContent(model);
            message.setText(text, true);
            logger.info("Send mail successfully to (" + email + ")");
        });
    }

    public String geVelocityTemplateContent(Map<String, Object> model){
        StringBuffer content = new StringBuffer();
        try{
            content.append(VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "/templates/velocity/verification-email.vm", model));
            return content.toString();
        }catch(Exception e){
            logger.error("Exception occurred while processing templates: "+e.getMessage());
        }
        return "";
    }


    public String geFreeMarkerTemplateContent(Map<String, Object> model){
        StringBuffer content = new StringBuffer();
        try{
            content.append(FreeMarkerTemplateUtils.processTemplateIntoString(
                    freemarkerConfiguration.getTemplate("text/verification-email.txt"),model));
            return content.toString();
        }catch(Exception e){
            logger.error("Exception occurred while processing templates: "+e.getMessage());
        }
        return "";
    }
}

package app.listener;

import app.event.OnRegistrationCompleteEvent;
import app.model.User;
import app.service.UserService;
import app.util.ConvertModelToBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.MessageSource;

import java.util.UUID;

public class RegistrationListener implements ApplicationListener<OnRegistrationCompleteEvent> {

    @Autowired
    private UserService service;

    @Autowired
    private MessageSource messages;


    @Override
    public void onApplicationEvent(OnRegistrationCompleteEvent onRegistrationCompleteEvent) {
        this.confirmRegistration(onRegistrationCompleteEvent);
    }

    private void confirmRegistration(OnRegistrationCompleteEvent event) {
        User user = event.getUser();
        String token = UUID.randomUUID().toString();

        service.createVerificationToken(ConvertModelToBean.mapUserToUserInfo(user), token);

    }

}

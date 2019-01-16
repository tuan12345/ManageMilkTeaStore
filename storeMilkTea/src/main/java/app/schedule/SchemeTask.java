package app.schedule;

import app.service.CartDetailService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class SchemeTask {
    private static final Logger logger = Logger.getLogger(SchemeTask.class);

    @Autowired
    private CartDetailService cartDetailService;

    @Scheduled(cron = "0 0 0 ? * ?")
    public void schemeDeleteCart() {
        cartDetailService.deleteCartDetailExpiry();
        logger.info("Schedule of task delete CartDetails everyday executed");
    }
}

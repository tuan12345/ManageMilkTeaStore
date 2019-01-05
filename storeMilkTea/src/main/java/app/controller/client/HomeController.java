package app.controller.client;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class HomeController {
    private static final Logger logger = Logger.getLogger(HomeController.class);

    @GetMapping({"", "home"})
    public ModelAndView index() {
        logger.info("home page");
        ModelAndView model = new ModelAndView("home");
        return model;
    }

    @GetMapping("/contact")
    public String contact() {
        return "/contact";
    }

}

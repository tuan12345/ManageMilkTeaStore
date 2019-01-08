package app.controller.common;

import app.bean.UserInfo;
import app.controller.BaseController;
import app.event.OnRegistrationCompleteEvent;
import app.model.User;
import app.model.VerificationToken;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.Calendar;
import java.util.Locale;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserInfo userInfo) {

        try {
            if (userService.checkLogin(userInfo)) {
                return new ResponseEntity<>(jwtService.generateTokenLogin(userInfo.getEmail()), HttpStatus.OK);

            } else {
                return new ResponseEntity<>("Wrong userId and password", HttpStatus.BAD_REQUEST);

            }
        } catch (Exception ex) {
            return new ResponseEntity<>("Server Error", HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserInfo userInfo, WebRequest request) {

        User registered = userService.createNewUserAccount(userInfo);
        if (registered == null)
            return new ResponseEntity<>("fail", HttpStatus.NOT_ACCEPTABLE);

        try {
            String appUrl = request.getContextPath();
            eventPublisher.publishEvent(new OnRegistrationCompleteEvent
                    (registered, request.getLocale(), appUrl));
        } catch (Exception me) {
            return new ResponseEntity<>("fail", HttpStatus.NOT_ACCEPTABLE);
        }

        return new ResponseEntity<>("successful", HttpStatus.OK);
    }

    @GetMapping("/registrationConfirm")
    public String confirmRegistration
            (@RequestParam("token") String token) {


        VerificationToken verificationToken = userService.getVerificationToken(token);
        if (verificationToken == null) {
            return "/confirm";
        }

        User user = verificationToken.getUser();
        Calendar cal = Calendar.getInstance();
        if ((verificationToken.getExpiryDate().getTime() - cal.getTime().getTime()) <= 0) {
            return "/confirm";
        }

        user.setEnabled(true);
        userService.saveRegisteredUser(user);
        return "/confirm";
    }

}

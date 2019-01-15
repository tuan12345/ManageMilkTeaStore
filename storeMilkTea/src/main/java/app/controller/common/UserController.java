package app.controller.common;

import app.bean.UserInfo;
import app.controller.BaseController;
import app.model.User;
import app.model.VerificationToken;
import app.util.ConvertBeanToModel;
import app.util.ConvertModelToBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;

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
    public ResponseEntity<String> register(@RequestBody UserInfo userInfo, HttpServletRequest request) {

        UserInfo registered = userService.createNewUserAccount(userInfo);
        if (registered == null)
            return new ResponseEntity<>("fail", HttpStatus.NOT_ACCEPTABLE);


        emailUtils.sendConfirmationEmail(registered.getEmail(),
                verificationTokenService.getVerificationTokenbyUser(registered));
        return new ResponseEntity<>("successful", HttpStatus.OK);
    }

    @GetMapping("/registrationConfirm")
    public String confirmRegistration
            (@RequestParam("token") String token) {
        VerificationToken verificationToken = verificationTokenService.getVerificationToken(token);
        if (verificationToken == null) {
            return "/confirm";
        }

        User user = verificationToken.getUser();
        Calendar cal = Calendar.getInstance();
        if ((verificationToken.getExpiryDate().getTime() - cal.getTime().getTime()) <= 0) {
            return "/confirm";
        }

        user.setEnable(true);
        userService.saveOrUpdate(ConvertModelToBean.mapUserToUserInfo(user));
        return "/confirm";
    }

}

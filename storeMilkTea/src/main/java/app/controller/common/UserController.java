package app.controller.common;

import app.bean.UserInfo;
import app.controller.BaseController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserInfo userInfo) {
        String result = "";
        HttpStatus httpStatus = null;
        try {
            if (userService.checkLogin(userInfo)) {
                result = jwtService.generateTokenLogin(userInfo.getUserName());
                httpStatus = HttpStatus.OK;
            } else {
                result = "Wrong userId and password";
                httpStatus = HttpStatus.BAD_REQUEST;
            }
        } catch (Exception ex) {
            result = "Server Error";
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<String>(result, httpStatus);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserInfo userInfo){
        String result = "";
        HttpStatus httpStatus = null;
        if (userService.createUser(userInfo)){
            result = "successful";
            httpStatus = httpStatus.OK;
        }else {
            httpStatus = httpStatus.NOT_ACCEPTABLE;
        }
        return new ResponseEntity<String>(result, httpStatus);
    }
}

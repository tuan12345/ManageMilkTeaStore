package app.service;

import app.bean.UserInfo;
import app.model.User;
import app.model.VerificationToken;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService extends BaseService<Integer, UserInfo> {

    boolean checkLogin(UserInfo userInfo);

    User createNewUserAccount(UserInfo userInfo);

    User getUserByToken(String verificationToken);

    VerificationToken createVerificationToken(UserInfo userInfo, String token);

    VerificationToken getVerificationToken(String VerificationToken);

    User saveRegisteredUser(User user);

}

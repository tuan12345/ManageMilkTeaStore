package app.service;

import app.bean.UserInfo;
import app.model.VerificationToken;

public interface VerificationTokenService extends BaseService<Integer, VerificationToken> {
    String getVerificationTokenbyUser(UserInfo userInfo);

    VerificationToken getVerificationToken(String VerificationToken);

    VerificationToken createVerificationToken(UserInfo userInfo, String token);
}

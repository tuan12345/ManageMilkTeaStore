package app.service.impl;

import app.bean.UserInfo;
import app.model.VerificationToken;
import app.service.VerificationTokenService;
import app.util.ConvertBeanToModel;

import java.io.Serializable;

public class VerificationTokenServiceImpl extends BaseServiceImpl implements VerificationTokenService {
    @Override
    public VerificationToken findById(Serializable key, boolean lock) {
        return null;
    }

    @Override
    public VerificationToken saveOrUpdate(VerificationToken entity) {
        return null;
    }

    @Override
    public boolean delete(VerificationToken entity) {
        return false;
    }

    @Override
    public String getVerificationTokenbyUser(UserInfo userInfo) {
        return verificationTokenDAO.findByUser(ConvertBeanToModel.mapUserInfoToUser(userInfo)).getToken();
    }

    @Override
    public VerificationToken getVerificationToken(String verificationToken) {
        try {
            return verificationTokenDAO.findByToken(verificationToken);

        } catch (Exception e) {
            return null;

        }
    }

    @Override
    public VerificationToken createVerificationToken(UserInfo userInfo, String token) {
        try {
            VerificationToken myToken = new VerificationToken(token, convertNewUserUtils.convertNewUser(userInfo));
            return verificationTokenDAO.saveOrUpdate(myToken);

        } catch (Exception e) {
            throw e;
        }

    }
}

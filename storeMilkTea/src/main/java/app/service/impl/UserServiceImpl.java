package app.service.impl;

import app.bean.UserInfo;
import app.model.User;
import app.model.VerificationToken;
import app.service.UserService;
import app.util.ConvertBeanToModel;
import app.util.UserUtils;

import java.io.Serializable;

public class UserServiceImpl extends BaseServiceImpl implements UserService {

    @Override
    public UserInfo findById(Serializable key, boolean lock) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserInfo saveOrUpdate(UserInfo entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean delete(UserInfo entity) {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public boolean checkLogin(UserInfo userInfo) {
        try {

            return userDAO.checkLogin(ConvertBeanToModel.mapUserInfoToUser(userInfo));
        } catch (Exception e) {

            return false;
        }

    }

    @Override
    public User createNewUserAccount(UserInfo userInfo) {

        try {

            if (UserUtils.checkFormatUser(userInfo)) {

                if (emailExist(userInfo.getEmail())) {
                    return userDAO.saveOrUpdate(convertNewUserUtils.convertNewUser(userInfo));
                } else return null;

            } else return null;

        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public User getUserByToken(String verificationToken) {
        try {
            return verificationTokenDAO.findByToken(verificationToken).getUser();

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

    @Override
    public VerificationToken getVerificationToken(String verificationToken) {
        try {
            return verificationTokenDAO.findByToken(verificationToken);

        } catch (Exception e) {
            return null;

        }
    }

    @Override
    public User saveRegisteredUser(User user) {
        try {
            return userDAO.saveOrUpdate(user);

        }catch (Exception e){
            throw  e;
        }
    }

    private boolean emailExist(String email) {
        return userDAO.loadUserByEmail(email) == null;

    }

}

package app.service.impl;

import app.bean.UserInfo;
import app.model.User;
import app.model.VerificationToken;
import app.service.UserService;
import app.util.ConvertBeanToModel;
import app.util.ConvertModelToBean;
import app.util.UserUtils;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.UUID;

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
    public UserInfo createNewUserAccount(UserInfo userInfo) {

        try {
            if (!UserUtils.checkFormatUser(userInfo))
                return null;

            if (!emailExist(userInfo.getEmail()))
                return null;

            User user = userDAO.saveOrUpdate(convertNewUserUtils.convertNewUser(userInfo));
            if (user == null)
                return null;

            String token = UUID.randomUUID().toString();
            if (verificationTokenDAO.saveOrUpdate(new VerificationToken(token, user)) == null)
                throw new NullPointerException("Can't generator Token for " + user.toString());

            return ConvertModelToBean.mapUserToUserInfo(user);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public UserInfo getUserByToken(String verificationToken) {
        try {
            return ConvertModelToBean
                    .mapUserToUserInfo(verificationTokenDAO.findByToken(verificationToken).getUser());

        } catch (Exception e) {
            return null;
        }
    }



    private boolean emailExist(String email) {
        try {
            return userDAO.loadUserByEmail(email) == null;
        } catch (Exception e) {
            return false;
        }

    }

}

package app.dao.impl;

import app.dao.GenericDAO;
import app.dao.VerificationTokenDAO;
import app.model.User;
import app.model.VerificationToken;

public class VerificationTokenDAOImpl extends GenericDAO<Integer, VerificationToken> implements VerificationTokenDAO {

    @Override
    public VerificationToken findByToken(String token) {
        return getSession()
                .createQuery("FROM VerificationToken WHERE token = :token", VerificationToken.class)
                .setParameter("token", token)
                .uniqueResult();
    }

    @Override
    public VerificationToken findByUser(User user) {
        return getSession().load(User.class, user).getVerificationToken();
    }

}

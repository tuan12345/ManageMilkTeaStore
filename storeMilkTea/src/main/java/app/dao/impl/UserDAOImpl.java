package app.dao.impl;

import app.dao.GenericDAO;
import app.dao.UserDAO;
import app.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class UserDAOImpl extends GenericDAO<Integer, User> implements UserDAO {

    @Override
    public boolean checkLogin(User checkAccount) {
        User user = getSession().createQuery("FROM User u", User.class).setMaxResults(1).uniqueResult();
        return user == null ? false : true;
    }

    @Override
    public User loadUserByUserNameAndEmail(String userName, String email) {
        return  getSession().createQuery("FROM User u WHERE u.fullName = :userName OR u.Email = :email", User.class)
                .setParameter("userName", userName)
                .setParameter("email",email).uniqueResult();
    }

    @Override
    public User loadUserByUserName(String userName) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("userName", userName));
        User user = (User) criteria.uniqueResult();
        return user;
    }

}

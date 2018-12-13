package app.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import app.dao.GenericDAO;
import app.dao.UserDAO;
import app.model.User;

public class UserDAOImpl extends GenericDAO<Integer, User> implements UserDAO {

	@Override
	public User loadUserByUserName(String userName) {
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", userName));
		User user = (User) criteria.uniqueResult();
		return user;
	}

}

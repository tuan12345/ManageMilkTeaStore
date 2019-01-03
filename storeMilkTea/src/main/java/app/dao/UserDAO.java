package app.dao;

import app.model.User;

public interface UserDAO extends BaseDAO<Integer, User> {
	User loadUserByUserName(String userName);
	User loadUserByUserNameAndEmail(String userName, String email);
	boolean checkLogin(User user);
}

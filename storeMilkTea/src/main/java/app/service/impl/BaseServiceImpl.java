package app.service.impl;

import app.dao.RoleDAO;
import app.dao.UserDAO;
import app.util.ConvertNewUserUtils;

public class BaseServiceImpl {
	protected UserDAO userDAO;
	protected RoleDAO roleDAO;
	protected ConvertNewUserUtils convertNewUserUtils;

	public void setConvertNewUserUtils(ConvertNewUserUtils convertNewUserUtils) {
		this.convertNewUserUtils = convertNewUserUtils;
	}

	public void setRoleDAO(RoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	

}

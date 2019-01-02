package app.service.impl;

import app.dao.RoleDAO;
import app.dao.UserDAO;
import app.util.ConvertPasswordUtils;

public class BaseServiceImpl {
	protected UserDAO userDAO;
	protected RoleDAO roleDAO;
	protected ConvertPasswordUtils convertPasswordUtils;

	public void setConvertPasswordUtils(ConvertPasswordUtils convertPasswordUtils) {
		this.convertPasswordUtils = convertPasswordUtils;
	}

	public void setRoleDAO(RoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	

}

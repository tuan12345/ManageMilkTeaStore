package app.service.impl;

import java.io.Serializable;

import app.bean.UserInfo;
import app.service.UserService;
import app.util.ConvertModelToDto;

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
	public UserInfo findUserInfoByUsername(String userName) {
		try {
			return ConvertModelToDto.mapUserToUserInfo(userDAO.loadUserByUserName(userName));
		} catch (Exception e) {
			return null;
		}
		
	}

}

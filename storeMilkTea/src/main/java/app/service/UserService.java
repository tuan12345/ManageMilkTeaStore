package app.service;

import app.bean.UserInfo;

public interface UserService extends BaseService<Integer, UserInfo> {
	UserInfo findUserInfoByUsername(String userName);
	boolean checkLogin(UserInfo userInfo);
	boolean createUser(UserInfo userInfo);

}

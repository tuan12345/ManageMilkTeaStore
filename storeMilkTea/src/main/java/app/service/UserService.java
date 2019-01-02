package app.service;

import app.bean.UserInfo;

public interface UserService extends BaseService<Integer, UserInfo> {
	UserInfo findUserInfoByUsername(String userName);
}

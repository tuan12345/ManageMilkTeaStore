package app.service;

import app.dto.UserInfo;

public interface UserService extends BaseService<Integer, UserInfo> {
	UserInfo findUserInfoByUsername(String userName);
}

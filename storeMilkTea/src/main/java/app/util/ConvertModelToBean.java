package app.util;

import app.bean.RoleInfo;
import app.bean.UserInfo;
import app.model.Role;
import app.model.User;

import java.util.function.Function;

public class ConvertModelToBean {
	public static RoleInfo mapRoleToRoleInfo(Role role) {
		Function<Role, RoleInfo> map = r -> new RoleInfo(r.getRole_Id(), r.getName());
		return map.apply(role);
	}
	public static UserInfo mapUserToUserInfo(User user) {
		Function<User, UserInfo> map = u -> new UserInfo (u.getUser_id(), u.getFullName(),u.getUserName(), u.getPassword(), u.getEmail(), mapRoleToRoleInfo(u.getRole()));
		return map.apply(user);
	}
}

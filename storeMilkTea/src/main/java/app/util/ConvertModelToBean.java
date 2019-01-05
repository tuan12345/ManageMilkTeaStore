package app.util;

import app.bean.RoleInfo;
import app.bean.UserInfo;
import app.model.Role;
import app.model.User;

import java.util.function.Function;

public class ConvertModelToBean {

    public static RoleInfo mapRoleToRoleInfo(Role role) {
        Function<Role, RoleInfo> map = r -> new RoleInfo(r.getId(), r.getName());

        return map.apply(role);
    }

    public static UserInfo mapUserToUserInfo(User user) {
        Function<User, UserInfo> map = u -> new UserInfo(
                u.getId(),
                u.getEmail(),
                u.getPassword(),
                u.getFullName(),
                u.getPhone(),
                u.getGender(),
                mapRoleToRoleInfo(u.getRole()));

        return map.apply(user);
    }
}

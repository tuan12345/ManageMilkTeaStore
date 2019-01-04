package app.util;

import app.bean.UserInfo;

public class UserUtils {
    public static boolean checkUserInfo(UserInfo userInfo){
        if (userInfo == null)
            return false;
        else if (userInfo.getFullName().matches("^[a-zA-Z0-9]{5,}$")
                && userInfo.getEmail().matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$")
                && userInfo.getPassword().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$"))
            return true;
        else return false;
    }
}

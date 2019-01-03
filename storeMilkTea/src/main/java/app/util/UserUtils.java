package app.util;

import app.bean.UserInfo;

public class UserUtils {
    public static boolean checkUserInfo(UserInfo userInfo){
        if (userInfo == null)
            return false;
        else if (userInfo.getName().matches("^[a-zA-Z0-9._-]{5,}$")
                && userInfo.getName().matches("^[a-zA-Z\\s]{5,50}")
                && userInfo.getPassword().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$"))
            return true;
        else return false;
    }
}

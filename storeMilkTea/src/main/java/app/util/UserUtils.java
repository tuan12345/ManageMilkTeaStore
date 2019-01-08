package app.util;

import app.bean.UserInfo;

public class UserUtils {


    public static boolean checkFormatUser(UserInfo userInfo) {
        if (userInfo == null)
            return false;
        else if (userInfo.getEmail().matches("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")
                && userInfo.getPassword().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$"))
            return true;
        else return false;
    }


}

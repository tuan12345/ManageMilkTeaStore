package app.util;

import javax.servlet.http.HttpServletRequest;

public class RequestUtils {

    public static int getErrorCode(HttpServletRequest httpRequest) {
        return (Integer) httpRequest
                .getAttribute("javax.servlet.error.status_code");
    }
}

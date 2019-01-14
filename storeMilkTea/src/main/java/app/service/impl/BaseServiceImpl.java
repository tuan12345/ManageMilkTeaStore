package app.service.impl;

import app.dao.RoleDAO;
import app.dao.UserDAO;
import app.dao.VerificationTokenDAO;
import app.util.ConvertNewUserUtils;
import lombok.Setter;

@Setter
public class BaseServiceImpl {
    protected UserDAO userDAO;
    protected RoleDAO roleDAO;
    protected ConvertNewUserUtils convertNewUserUtils;
    protected VerificationTokenDAO verificationTokenDAO;

}

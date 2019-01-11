package app.service.impl;

import app.dao.*;
import app.util.ConvertNewUserUtils;
import lombok.Setter;

@Setter
public class BaseServiceImpl {
    protected UserDAO userDAO;
    protected RoleDAO roleDAO;
    protected ProductDAO productDAO;
    protected ConvertNewUserUtils convertNewUserUtils;
    protected VerificationTokenDAO verificationTokenDAO;
    protected CartDetailDAO cartDetailDAO;

}

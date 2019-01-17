package app.service.impl;

import app.dao.CartDetailDAO;
import app.dao.CategoryDAO;
import app.dao.ProductDAO;
import app.dao.RoleDAO;
import app.dao.UserDAO;
import app.dao.VerificationTokenDAO;
import app.util.ConvertNewUserUtils;
import lombok.Setter;

@Setter
public class BaseServiceImpl {
    protected UserDAO userDAO;
    protected RoleDAO roleDAO;
    protected ProductDAO productDAO;
    protected CategoryDAO categoryDAO;
    protected ConvertNewUserUtils convertNewUserUtils;
    protected VerificationTokenDAO verificationTokenDAO;
    protected CartDetailDAO cartDetailDAO;

}

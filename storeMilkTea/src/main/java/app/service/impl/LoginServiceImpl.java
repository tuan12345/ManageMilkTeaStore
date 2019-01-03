package app.service.impl;

import app.bean.CustomUserDetails;
import app.model.User;
import app.service.LoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class LoginServiceImpl extends BaseServiceImpl implements LoginService {
    private static final Logger logger = Logger.getLogger(LoginServiceImpl.class);

    private CustomUserDetails setUserDetail(User user) {
        CustomUserDetails userDetail = new CustomUserDetails();
        userDetail.setId(user.getUser_id());
        userDetail.setEmail(user.getEmail());
        userDetail.setPassword(user.getPassword());
        return userDetail;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            User user = userDAO.loadUserByUserName(username);
            CustomUserDetails userDetail = setUserDetail(user);
            userDetail.setUsername(username);
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            authorities.add(new SimpleGrantedAuthority(user.getRole().getName()));
            userDetail.setAuthorities(authorities);

            BeanUtils.copyProperties(user, userDetail);

            return userDetail;
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
    }

}

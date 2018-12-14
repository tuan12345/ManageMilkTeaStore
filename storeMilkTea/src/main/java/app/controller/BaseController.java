package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.security.core.context.SecurityContextHolder;

import app.dto.UserInfo;
import app.service.UserService;

public class BaseController {
	@Autowired
	protected UserService userService;
	@Autowired
	protected ReloadableResourceBundleMessageSource messageSource;
	
	protected UserInfo currentUser() {
		try {
			return userService.findUserInfoByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
		} catch (Exception e) {
			return null;
		}
	}

}

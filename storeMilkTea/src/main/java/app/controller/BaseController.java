package app.controller;

import app.service.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.security.core.context.SecurityContextHolder;

import app.bean.UserInfo;
import app.service.UserService;

public class BaseController {
	@Autowired
	protected UserService userService;
	@Autowired
	protected JWTService jwtService;
	@Autowired
	protected ReloadableResourceBundleMessageSource messageSource;
	@Autowired
	protected ApplicationEventPublisher eventPublisher;
}

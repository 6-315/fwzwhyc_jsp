package org.pxxy.service.impl;

import org.pxxy.dao.UserDao;
import org.pxxy.domain.User;
import org.pxxy.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Override
	public User login(User user) {
		return userDao.login(user);
	}

}

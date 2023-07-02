package com.example.userservice.service;

import com.example.userservice.dao.UserDao;
import com.example.userservice.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Author: Garroshh date: 2020/7/9 8:19 下午
 */
@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public User add(User user) {
		return userDao.save(user);
	}

	public User get(long id) {
		return userDao.getOne(id);
	}
}

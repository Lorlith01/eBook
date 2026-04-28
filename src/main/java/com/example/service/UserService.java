package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.UserDao;
import com.example.entity.Users;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	@Transactional
	public void saveUser(Users users) {
		userDao.save(users);
	}
}

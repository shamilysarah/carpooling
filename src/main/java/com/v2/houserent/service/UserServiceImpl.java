package com.v2.houserent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v2.houserent.dao.UserDao;
import com.v2.houserent.model.Login;
import com.v2.houserent.model.User;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	public void register(User user){
		userDao.register(user);
	}
	 public User validateUser(Login login){
		 return userDao.validateUser(login);
	 }
	}



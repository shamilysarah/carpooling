package com.v2.houserent.dao;

import org.springframework.stereotype.Repository;

import com.v2.houserent.model.Login;
import com.v2.houserent.model.User;
@Repository
public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}
package com.v2.houserent.service;

import org.springframework.stereotype.Service;

import com.v2.houserent.model.Login;
import com.v2.houserent.model.User;
@Service
public interface UserService {
  void register(User user);
  User validateUser(Login login);


}

package com.api.APISecurity.service;

import java.util.List;

import com.api.APISecurity.bean.User;

public interface UserService {
 
 public List<User> getAllUser();
 
 public User getUserById(int id);
}
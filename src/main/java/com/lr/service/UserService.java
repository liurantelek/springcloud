package com.lr.service;

import com.lr.pojo.User;

public interface UserService {
    public User getUserById(int userId);
    int insertUser(User user);

    int deleteUserByPrimaryKey(int id);
    int updateUser(User user);
}

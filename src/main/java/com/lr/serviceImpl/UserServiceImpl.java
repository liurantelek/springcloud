package com.lr.serviceImpl;

import com.lr.dao.UserDao;
import com.lr.pojo.User;
import com.lr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
   private UserDao userDao;
    @Override
    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
    @Override
    public int insertUser(User user){
       return userDao.insertUser(user);
    }

    @Override
    public int deleteUserByPrimaryKey(int id) {
        return userDao.deleteUserByPrimaryKey(id);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateByPrimaryKey(user);
    }
}

package com.lr.dao;

import com.lr.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Mapper
public interface UserDao {
    User selectByPrimaryKey(Integer id);

    int insertUser(User user);

    int updateByPrimaryKey(User user);

    int deleteUserByPrimaryKey(int id);
}

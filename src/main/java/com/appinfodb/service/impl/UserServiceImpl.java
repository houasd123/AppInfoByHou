package com.appinfodb.service.impl;

import com.appinfodb.mapper.UserMapper;
import com.appinfodb.pojo.User;
import com.appinfodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int getUserCount(Map<String, Object> map) {
        return userMapper.getUserCount(map);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserListByObj(User user) {
        return userMapper.getUserListByObj(user);
    }

    @Override
    public List<User> getUserPageByMap(Map<String, Object> map) {
        return userMapper.getUserPageByMap(map);
    }

    @Override
    public User getUserByMap(Map<String, Object> map) {
        return userMapper.getUserByMap(map);
    }
}

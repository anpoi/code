package com.bjpowernode.service.impl;

import com.bjpowernode.domain.User;
import com.bjpowernode.mapper.UserMapper;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
    public boolean insertUser(User user) {
        boolean flag = false;
        try {
            userMapper.insertUser(user);
            flag = true;
        }catch (Exception e){
            System.out.println("新增失败！");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUser(User user) {
        boolean flag = false;
        try {
            userMapper.updateUser(user);
            flag = true;
        }catch (Exception e){
            System.out.println("新增失败！");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(String id) {
        boolean flag = false;
        try {
            userMapper.deleteUser(id);
            flag = true;
        }catch (Exception e){
            System.out.println("新增失败！");
            e.printStackTrace();
        }
        return flag;
    }
}

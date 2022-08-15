package com.bjpowernode.service;

import com.bjpowernode.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAllUsers();

    /**
     * 增加用户信息
     */
    boolean insertUser(User user);


    /**
     * 修改用户信息
     * @return
     */
    boolean updateUser(User User);

    /**
     * 删除用户
     */
    boolean deleteUser(String id);
}

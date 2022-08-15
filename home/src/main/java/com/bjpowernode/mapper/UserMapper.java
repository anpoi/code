package com.bjpowernode.mapper;

import com.bjpowernode.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//用户接口
@Mapper
public interface UserMapper {

    //查询所有的用户信息
    @Select("select  id,name,login_act as loginAct, login_pwd as loginPwd, role from tbl_user")
    List<User> selectAllUsers();

    @Insert("insert into tbl_user(id,name,login_act,login_pwd,role) value(#{id},#{name},#{loginAct},#{loginPwd},#{role})")
    //增加用户
    void insertUser(User user);

    @Update("update tbl_user set name=#{name},login_act=#{loginAct},login_pwd=#{loginPwd},role=#{role} where id=#{id}")
    //修改用户信息
    void updateUser(User user);

    @Delete("delete from tbl_user where id=#{id}")
    //删除用户信息
    void deleteUser(String id);

}

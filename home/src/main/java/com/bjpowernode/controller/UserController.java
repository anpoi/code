package com.bjpowernode.controller;

import com.bjpowernode.domain.Shopping;
import com.bjpowernode.domain.User;
import com.bjpowernode.service.ShoppingService;
import com.bjpowernode.service.UserService;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags = "用户信息")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "用户信息",notes = "查询所有的账户")
    @RequestMapping(value = "/User/select",method = RequestMethod.GET)
    public @ResponseBody List<User> selectAllUsers(){
        return userService.selectAllUsers();
    }

    @ApiOperation(value = "新增用户",notes = "增加用户记录")
    @RequestMapping(value = "/User/insert",method = RequestMethod.POST)
    public @ResponseBody boolean insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }


    @ApiOperation(value = "修改用户信息",notes = "根据id更改指定的消费记录")
    @RequestMapping(value = "/User/update",method = RequestMethod.PUT)
    public @ResponseBody boolean updateUser(@RequestBody User user){

        return userService.updateUser(user);
    }

    @ApiOperation(value = "删除用户",notes = "根据id删除指定的用户")
    @RequestMapping(value = "/User/delete",method = RequestMethod.DELETE)
    public @ResponseBody boolean deleteUser(@RequestParam(value = "id",required = true) String id){

        return userService.deleteUser(id);
    }



}

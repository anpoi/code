package com.bjpowernode.service;

import com.bjpowernode.domain.Type;
import com.bjpowernode.domain.User;

import java.util.List;

public interface TypeService {
    /**
     * 查询所有类型
     * @return
     */
    List<Type> selectAllType();

    /**
     * 增加类型
     */
    boolean insertType(Type type);

    /**
     * 删除用户
     */
    boolean deleteType(String type);
}

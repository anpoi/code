package com.bjpowernode.service.impl;

import com.bjpowernode.domain.Type;
import com.bjpowernode.mapper.TypeMapper;
import com.bjpowernode.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Resource
    private TypeMapper typeMapper;

    @Override
    public List<Type> selectAllType() {
        return typeMapper.selectAllType();
    }

    @Override
    public boolean insertType(Type type) {
        boolean flag = false;
        try {
            typeMapper.insertType(type);
            flag = true;
        }catch (Exception e){
            System.out.println("新增失败！");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteType(String type) {
        boolean flag = false;
        try {
            typeMapper.deleteType(type);
            flag = true;
        }catch (Exception e){
            System.out.println("新增失败！");
            e.printStackTrace();
        }
        return flag;
    }
}

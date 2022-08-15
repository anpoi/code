package com.bjpowernode.service.impl;

import com.bjpowernode.domain.Shopping;
import com.bjpowernode.mapper.ShoppingMapper;
import com.bjpowernode.service.ShoppingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {
    @Resource
    private ShoppingMapper shoppingMapper;

    @Override
    public List<Shopping> selectAllShopping() {
        return shoppingMapper.selectAllShopping();
    }

    @Override
    public boolean insertShopping(Shopping shopping) {
        boolean flag = false;
        try {
            shoppingMapper.insertShopping(shopping);
            flag = true;
        }catch (Exception e){
            System.out.println("新增失败！");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateShopping(Shopping shopping) {
       boolean flag = false;
        try {
           shoppingMapper.updateShopping(shopping);
           flag = true;
       }catch (Exception e){
            System.out.println("修改失败！");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteShopping(String id) {
        boolean flag = false;
        try {
            shoppingMapper.deleteShopping(id);
            flag=true;
        }catch (Exception e){
            System.out.println("删除失败");
            e.printStackTrace();
        }
        return flag;
    }
}

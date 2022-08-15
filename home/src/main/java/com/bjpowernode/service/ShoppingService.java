package com.bjpowernode.service;

import com.bjpowernode.domain.Shopping;

import java.util.List;

public interface ShoppingService {

    /**
     * 查询所有消费记录
     * @return
     */
    List<Shopping> selectAllShopping();

    /**
     * 增加消费记录
     */
    boolean insertShopping(Shopping shopping);


    /**
     * 修改消费记录信息
     * @param shopping
     * @return
     */
    boolean updateShopping(Shopping shopping);

    /**
     * 删除消费记录
     */
    boolean deleteShopping(String id);
}

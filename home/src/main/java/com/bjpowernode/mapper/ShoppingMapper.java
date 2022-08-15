package com.bjpowernode.mapper;

import com.bjpowernode.domain.Shopping;
import org.apache.ibatis.annotations.*;

import java.util.List;

//购物记录接口
@Mapper
public interface ShoppingMapper {

    @Select("select id,time,type,cost,name,create_time as createTime,create_id as createId,description from tbl_shopping")
    //查询所有的购物记录
    List<Shopping> selectAllShopping();

    @Insert("insert into tbl_shopping(id,time,type,cost,name,description) value(#{id},#{time},#{type},#{cost},#{name},#{description})")
    //增加消费记录
    void insertShopping(Shopping shopping);

    @Update("update tbl_shopping set time=#{time},type=#{type},cost=#{cost},name=#{name},create_time=#{createTime},create_id=#{createId},description=#{description} where id=#{id}")
    //修改购物记录
    void updateShopping(Shopping shopping);

    @Delete("delete from tbl_shopping where id=#{id}")
    //删除购物记录
    void deleteShopping(String id);


}

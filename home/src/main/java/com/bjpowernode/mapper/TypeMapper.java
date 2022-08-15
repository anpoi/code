package com.bjpowernode.mapper;

import com.bjpowernode.domain.Type;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TypeMapper {
    //查询所有的消费类型
    @Select("select type,name from tbl_type")
    List<Type> selectAllType();

    @Insert("insert into tbl_type(type,name) value(#{type})")
    //增加类型
    void insertType(Type type);

    @Delete("delete from tbl_type where type=#{type}")
    //删除类型
    void deleteType(String type);

}

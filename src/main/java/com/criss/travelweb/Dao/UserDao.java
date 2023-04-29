package com.criss.travelweb.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.criss.travelweb.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @author Criss
 * @Date 2023/4/28
 * extends BaseMapper<User> 里面有很多自带的CRUD
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
    //【成功】找到了数据
    @Select("select * from user where id = #{id}")
    User getById(Integer id);

    @Select("select * from user where username = #{username}")
    User getByName(String username);

    @Select("select * from user where email= #{email}")
    User getByEmail();

    @Select("select * from user")
    List<User> getAll();

}

package com.criss.travelweb.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.criss.travelweb.Entity.User;
import org.apache.ibatis.annotations.*;

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
    User getByEmail(String email);

    @Select("select * from user")
    List<User> getAll();


    //删除delete
    @Delete("DELETE * from user where id = #{id}")
    User deleteById(Integer id);

    //INSERT INTO t_user (id,name, password) VALUES(#{id}, #{name}, #{password})
    @Insert("INSERT INTO user (id,username,password,email) VALUES(#{id}, #{username}, #{password}, #{email})")
    User insert(Integer id, String username, String password,String email);

    @Insert("INSERT INTO user (id,username,password,email) VALUES(#{id}, #{username}, #{password}, #{email})")
    int insert(User user);//不一定insert成功

    //update
    @Update("update user set username = #{username},password = #{password},email = #{email} where id=#{id}")
    User update(User user);

}

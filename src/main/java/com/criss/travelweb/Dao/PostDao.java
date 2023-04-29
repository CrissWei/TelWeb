package com.criss.travelweb.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.criss.travelweb.Entity.Post;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface PostDao extends BaseMapper<Post> {

    @Select("select * from post")
    List<Post> getAll();

    @Select("select * from post where postId = #{postId}")
    Post getById(Integer postId);

    @Select("SELECT * from post WHERE postTitle LIKE #{postTitle} order by postId")
    List<Post> getLike(String postTitle);

    @Select({"SELECT * from post WHERE postTitle LIKE #{postTitle} or postContent LIKE #{postContent} order by postId"})
    List<Post> getLike(String postTitle, String postContent);


    //删除delete
    @Delete("DELETE * from post where postId = #{postId}")
    Post deleteById(Integer postId);

    //INSERT INTO t_user (id,name, password) VALUES(#{id}, #{name}, #{password})
    @Update("INSERT INTO post (postId,postTitle,postContent) VALUES(#{postId}, #{postTitle}, #{postContent})")
    Post add(Integer postId, String postTitle, String postContent);
}

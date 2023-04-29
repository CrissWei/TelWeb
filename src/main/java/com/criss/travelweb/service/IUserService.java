package com.criss.travelweb.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.criss.travelweb.Entity.User;


public interface IUserService extends IService<User>{
/*
    //自己根据实际需求添加的方法，而不是MyBatisPlus自带的最基本的CRUD
    Boolean updateUser(User user);
    Boolean insertUser(User user);
    Boolean deleteUser(Integer id );

    */
/*
     * 自定义一个分页操作
     */
/*
    IPage<User> getPage(Integer currentPage, Integer pageSize);
    //这个方法是方面用户来做条件查询操作的
    IPage<User> getPage(Integer currentPage, Integer pageSize,User user);

*/

}

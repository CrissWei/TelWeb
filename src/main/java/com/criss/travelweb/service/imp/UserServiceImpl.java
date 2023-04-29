package com.criss.travelweb.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.criss.travelweb.Dao.UserDao;
import com.criss.travelweb.Entity.User;
import com.criss.travelweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

/*    @Autowired
    private UserDao userDao;



    @Override
    public Boolean updateUser(User user) {
        return userDao.updateById(user)>0;
    }

    @Override
    public Boolean insertUser(User user) {
        return userDao.insert(user)>0;
    }

    @Override
    public Boolean deleteUser(Integer id) {
        return userDao.deleteById(id)>0;
    }

    @Override
    public IPage<User> getPage(Integer currentPage, Integer pageSize) {
        IPage<User> page = new Page<>(currentPage, pageSize);
        return userDao.selectPage(page, null);
    }

    @Override
    public IPage<User> getPage(Integer currentPage, Integer pageSize, User user) {
        //不知道为什么使用 LambdaQueryWrapper<Book> 会报错，所以这个我使用QueryWrapper
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.like("id",user.getId());
        qw.like("username",user.getUsername());
        qw.like("password",user.getPassword());
        qw.like("email",user.getEmail());
        IPage page = new Page(currentPage, pageSize);
        return userDao.selectPage(page, qw);
    }*/
}

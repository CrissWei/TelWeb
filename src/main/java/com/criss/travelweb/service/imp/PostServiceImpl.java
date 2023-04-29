package com.criss.travelweb.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.criss.travelweb.Dao.PostDao;
import com.criss.travelweb.Entity.Post;
import com.criss.travelweb.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostServiceImpl extends ServiceImpl<PostDao,Post> implements IPostService {


/*    @Autowired
    private PostDao postDao;


    @Override
    public List<Post> list() {
        return postDao.getAll();
    }*/
}

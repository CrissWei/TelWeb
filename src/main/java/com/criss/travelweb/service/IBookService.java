package com.criss.travelweb.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.criss.travelweb.Entity.Book;

public interface IBookService extends IService<Book> {
    //自己根据实际需求添加的方法，而不是MyBatisPlus自带的最基本的CRUD
    Boolean updateBook(Book book);
    Boolean insertBook(Book book);
    Boolean deleteBook(Integer id );

    /**
     * 自定义一个分页操作
     */
    IPage<Book> getPage(Integer currentPage, Integer pageSize);
    //这个方法是方面用户来做条件查询操作的
    IPage<Book> getPage(Integer currentPage, Integer pageSize,Book book);


}

package com.mybcs.dao;

import java.util.List;

import com.mybcs.bean.Book;

public interface BookDao {
    public boolean AddBook(Book book);
    //添加书籍
    
    public List list();
    //查询书籍
    
    public boolean delete(String nameofBook);
    //删除书籍
    
    public Book findBook(String nameofBook);
    //查找书籍
    
    public void Update(Book book);
    //修改
}

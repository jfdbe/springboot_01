package com.xuhe.dao;

import com.xuhe.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 徐鹤
 * @create 2022-08-09 20:25
 */
@Mapper
public interface BookDao {

    @Select("select * from tbl_book where id=#{id}")
    public List<Book> getById(Integer id);
}

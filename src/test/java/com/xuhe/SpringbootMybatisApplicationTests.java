package com.xuhe;

import com.xuhe.dao.BookDao;
import com.xuhe.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    BookDao bookDao;
    @Test
    void contextLoads() {
        List<Book> byId = bookDao.getById(1);
        System.out.println(byId);
        System.out.println("git测试,学习使用git");
        System.out.println("idea使用git");
    }

}

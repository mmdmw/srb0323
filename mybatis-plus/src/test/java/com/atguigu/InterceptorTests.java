package com.atguigu;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InterceptorTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01(){
        Page<User> page = new Page<>(1,5);
        userMapper.selectPage(page,null);
        System.out.println(page);
    }
}

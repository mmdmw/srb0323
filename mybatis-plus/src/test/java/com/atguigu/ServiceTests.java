package com.atguigu;

import com.atguigu.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTests {
    @Autowired
    private UserService userService;

    @Test
    public void test01(){
        int count = userService.count();
        System.out.println(count);
    }
}

package com.atguigu;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisPlusApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test04(){
        int i = userMapper.deleteById(1);
        System.out.println(i);
    }

    @Test
    public void test03(){
        User user = new User();
        user.setUsername("马克");
        user.setAge(18);
        user.setEmail("123456@qq.com");
        userMapper.insert(user);
    }

    @Test
    public void test02(){
        List<User> users = userMapper.selectAll("Tom");
        users.forEach(System.out::println);
    }

    @Test
    public void test01(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}

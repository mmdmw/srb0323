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
        for (int i = 0; i < 20 ; i++) {
        User user = new User();
        user.setUsername("mary"+(int)(Math.random()*100+i));
        user.setAge((int)(Math.random()*100));
        user.setEmail((int)(Math.random()*10000000)+"@qq.com");
        userMapper.insert(user);
        }
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

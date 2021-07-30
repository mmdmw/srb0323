package com.atguigu;

import com.atguigu.mapper.ProductMapper;
import com.atguigu.pojo.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class testConcurrentUpdate {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void test01(){

        Product product1 = productMapper.selectById(1L);
        Product product2 = productMapper.selectById(1L);
        product1.setPrice(product1.getPrice()+50);
        int result = productMapper.updateById(product1);
        System.out.println(result);
        product2.setPrice(product2.getPrice()+30);
        int result2 = productMapper.updateById(product2);
        System.out.println(result2);

        Product product3 = productMapper.selectById(1L);
        System.out.println(product3.getPrice());
    }
}

package com.atguigu.srb.core.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class IndexController {

    @GetMapping("/user/list")
    public Map<String,Object> userList(){
        Map<String, Object> map = new HashMap<>();;
        map.put("code",20000);
        map.put("test","userList");
        return map;
    }
}

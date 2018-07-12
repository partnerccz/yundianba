package com.yundianba.controller;

import com.yundianba.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述:
 * tet
 *
 * @author partner
 * @create 2018-07-12 18:09
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/index")
    @ResponseBody
    public User test() {
        return userMapper.findById("1");
    }
}

package com.leyou.userservice.controller;

import com.leyou.userservice.entity.User;
import com.leyou.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @ClassName: UserController
 * @Description: TODO
 * @Author: sqq
 * @Date: 2019/7/23
 * @Time: 9:18
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    private User queryById(@PathVariable("id") Long id){
        return userService.queryById(id);

    }
}

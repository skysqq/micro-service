package com.sqq.okhttp_rpc.controller;

import com.sqq.okhttp_rpc.pojo.User;
import com.sqq.okhttp_rpc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @ClassName: ConsumerController
 * @Description: TODO
 * @Author: sqq
 * @Date: 2019/7/23
 * @Time: 11:27
 **/
@RestController
@RequestMapping("consume")
public class ConsumerController {

    @Autowired
    private UserService userService;

    @GetMapping
    private List<User> queryUser(@RequestParam("ids") List<Long>  ids){
        return this.userService.queryUserByIds(ids);
    }
}

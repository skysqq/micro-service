package com.sqq.okhttp_rpc.dao;

import com.sqq.okhttp_rpc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @ClassName: UserDao
 * @Description: TODO
 * @Author: sqq
 * @Date: 2019/7/23
 * @Time: 10:53
 **/
@Component
public class UserDao {

    @Autowired
    private RestTemplate restTemplate;

    public User queryUserById(Long id){
        String url = "http://localhost:8081/user/"+id;
        return this.restTemplate.getForObject(url, User.class);
    }
}

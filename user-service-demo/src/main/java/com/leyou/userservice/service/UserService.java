package com.leyou.userservice.service;

import com.leyou.userservice.dao.UserMapper;
import com.leyou.userservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @ClassName: UserService
 * @Description: TODO
 * @Author: sqq
 * @Date: 2019/7/23
 * @Time: 9:15
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户Id查询用户信息
     * @param id
     * @return
     */
    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}

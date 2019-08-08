package com.leyou.userservice.dao;

import com.leyou.userservice.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @ClassName: UserMapper
 * @Description: TODO
 * @Author: sqq
 * @Date: 2019/7/23
 * @Time: 9:12
 **/
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
}

package cn.com.fwen.springboot.mapper;

import cn.com.fwen.springboot.entity.User;

import java.util.List;

/**
 *  mapper代理对象
 */
public interface UserMapper {

    //查询所有用户
    List<User> selAllUser() throws Exception;
}

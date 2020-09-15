package cn.com.fwen.springboot.service;

import cn.com.fwen.springboot.entity.User;

import java.util.List;
import java.util.Map;

/**
 *  用户业务层接口
 */
public interface UserService {

    //查询所有用户
    List<User> findAllUser() throws Exception;

    //分页查询用户数据
    Map<String,Object> findPageUser(Integer page, Integer limit) throws Exception;
}

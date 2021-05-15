package com.cbdeck.cbdeckserver.systemmanager.service.impl;

import com.cbdeck.cbdeckserver.systemmanager.bean.User;
import com.cbdeck.cbdeckserver.systemmanager.controller.UserController;
import com.cbdeck.cbdeckserver.systemmanager.mapper.UserMapper;
import com.cbdeck.cbdeckserver.systemmanager.service.UserService;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: 用户业务实现类
 *
 * @date: 2021/2/10 21:39
 * @author: gong.wei
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 日志
     */
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询用户列表
     *
     * @return
     */
    @Override
    public List<User> getUserList() {
        if(null == userMapper){
            log.info("userMapper is null");
        }
        List<User> userList = userMapper.getUserList();
        return userMapper.getUserList();
    }
}

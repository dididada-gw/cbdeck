package com.cbdeck.cbdeckserver.systemmanager.service;

import com.cbdeck.cbdeckserver.systemmanager.bean.User;

import java.util.List;

/**
 * description: 用户业务测接口
 *
 * @date: 2021/2/10 21:38
 * @author: gong.wei
 */
public interface UserService {

    /**
     * 查询用户列表
     *
     * @return
     */
    List<User> getUserList();
}

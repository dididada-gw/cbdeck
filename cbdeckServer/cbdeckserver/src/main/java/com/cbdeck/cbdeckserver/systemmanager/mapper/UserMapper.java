package com.cbdeck.cbdeckserver.systemmanager.mapper;

import com.cbdeck.cbdeckserver.systemmanager.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description: 用户数据层
 *
 * @date: 2021/2/10 21:49
 * @author: gong.wei
 */
@Repository
public interface UserMapper {

    /**
     * 查询用户列表
     *
     * @return
     */
    List<User> getUserList();
}

package com.cbdeck.cbdeckserver.systemmanager.bean;

import lombok.Data;
import lombok.ToString;

/**
 * description: 用户实体类
 *
 * @date: 2021/2/10 21:19
 * @author: gong.wei
 */
@Data
@ToString
public class User {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户名称
     */
    private String userName;
}

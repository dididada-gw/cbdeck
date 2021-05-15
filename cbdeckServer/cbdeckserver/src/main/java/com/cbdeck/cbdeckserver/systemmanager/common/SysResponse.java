package com.cbdeck.cbdeckserver.systemmanager.common;

import com.cbdeck.cbdeckserver.common.CommonResponse;
import com.cbdeck.cbdeckserver.systemmanager.bean.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * description: 系统管理
 *
 * @date: 2021/2/10 21:23
 * @author: gong.wei
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
public class SysResponse extends CommonResponse {

    private List<User> userList;
}

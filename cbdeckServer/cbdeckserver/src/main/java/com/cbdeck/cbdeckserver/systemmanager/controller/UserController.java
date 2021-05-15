package com.cbdeck.cbdeckserver.systemmanager.controller;

import com.cbdeck.cbdeckserver.common.CommonResponse;
import com.cbdeck.cbdeckserver.systemmanager.bean.User;
import com.cbdeck.cbdeckserver.systemmanager.common.SysConstant;
import com.cbdeck.cbdeckserver.systemmanager.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description: 用户接口
 *
 * @date: 2021/2/10 21:19
 * @author: gong.wei
 */
@RestController
public class UserController {

    /**
     * 日志
     */
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 用户列表查询
     *
     * @return CommonResponse
     */
    @GetMapping("/getUserList.do")
    public CommonResponse getUserList(){
        CommonResponse response = new CommonResponse();
        try {
            List<User> userList =  userService.getUserList();
            Map<String,Object> data = new HashMap<>(1);
            data.put("userList",userList);
            response.setCode(SysConstant.COM_SUCCESS_CODE);
            response.setMsg(SysConstant.COM_SUCCESS_MSG);
            response.setData(data);
            return response;
        }catch (Exception e){
            response.setCode(SysConstant.COM_FAIL_CODE);
            response.setMsg(SysConstant.COM_FAIL_MSG);
            log.error("getUserList error",e);
            return response;
        }
    }
}

package com.cbdeck.cbdeckserver.systemmanager.common;

/**
 * description: 系统管理模块返回码和返回描述
 *
 * @date: 2021/2/10 21:03
 * @author: gong.wei
 */
public interface SysConstant {

    /**
     * 系统管理模块的成功返回码
     */
    public static final String COM_SUCCESS_CODE = "000100";

    /**
     * 系统管理模块的成功返回描述
     */
    public static final String COM_SUCCESS_MSG = "success";

    /**
     * 系统管理模块的失败返回码
     */
    public static final String COM_FAIL_CODE = "000101";

    /**
     * 系统管理模块的失败返回码
     */
    public static final String COM_FAIL_MSG = "failed";

    /**
     * 系统管理模块用户查询接口错误返回码
     */
    public static String SYS_QUERY_USER_FAIL_CODE = "000102";

    /**
     * 系统管理模块用户查询接口错误返回码
     */
    public static String SYS_QUERY_USER_FAIL_MSG = "query_user_fail";
}

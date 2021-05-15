package com.cbdeck.cbdeckserver.common;

/**
 * description: TODO
 *
 * @date: 2021/2/10 21:03
 * @author: gong.wei
 */
public interface CommonConstant {

    /**
     * 公共的成功返回码
     */
    public static final String COM_SUCCESS_CODE = "000000";

    /**
     * 公共的成功返回描述
     */
    public static final String COM_SUCCESS_MSG = "success";

    /**
     * 公共的失败返回码
     */
    public static final String COM_FAIL_CODE = "000000";

    /**
     * 公共的失败返回码
     */
    public static final String COM_FAIL_MSG = "fail";

    public interface SystemModule{

        /**
         * 用户查询接口错误返回码
         */
        public static String SYS_SUCCESS_CODE = "";
    }
}

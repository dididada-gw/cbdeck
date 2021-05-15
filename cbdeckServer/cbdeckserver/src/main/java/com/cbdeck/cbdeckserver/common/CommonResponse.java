package com.cbdeck.cbdeckserver.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

/**
 * description: TODO
 *
 * @date: 2021/2/10 20:55
 * @author: gong.wei
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse {

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private Map<String,Object> data;
}

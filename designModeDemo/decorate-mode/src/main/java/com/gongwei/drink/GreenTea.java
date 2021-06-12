package com.gongwei.drink;

import com.gongwei.Cost;

/**
 * description: 绿茶
 *
 * @date: 2021/6/12 23:10
 * @author: gong.wei
 */
public class GreenTea extends Cost {

    private static final Double COST = 3D;


    @Override
    public Double cost() {
        return COST;
    }
}

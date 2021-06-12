package com.gongwei.drink;

import com.gongwei.Cost;

/**
 * description: 红茶
 *
 * @date: 2021/6/12 23:09
 * @author: gong.wei
 */
public class RedTea extends Cost {

    private static final Double COST = 4D;

    @Override
    public Double cost() {
        return COST;
    }
}

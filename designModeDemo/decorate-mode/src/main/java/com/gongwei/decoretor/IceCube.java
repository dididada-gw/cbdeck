package com.gongwei.decoretor;

import com.gongwei.Cost;

/**
 * description: 冰块
 *
 * @date: 2021/6/12 23:12
 * @author: gong.wei
 */
public class IceCube extends ToppingDecorator {

    private static final Double COST = 0.3;

    private Cost cost;

    public IceCube(Cost cost){
        this.cost = cost;
    }

    @Override
    public Double cost() {
        return COST+this.cost.cost();
    }
}

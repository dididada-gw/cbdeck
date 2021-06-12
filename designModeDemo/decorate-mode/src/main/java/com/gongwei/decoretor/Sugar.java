package com.gongwei.decoretor;

import com.gongwei.Cost;

/**
 * description: 糖
 *
 * @date: 2021/6/12 23:11
 * @author: gong.wei
 */
public class Sugar extends ToppingDecorator {

    private static final Double COST = 1.0;

    private Cost cost;

    public Sugar(Cost cost){
        this.cost = cost;
    }

    @Override
    public Double cost() {
        return COST+this.cost.cost();
    }
}

package com.gongwei.decoretor;

import com.gongwei.Cost;

/**
 * description: 布丁
 *
 * @date: 2021/6/12 23:12
 * @author: gong.wei
 */
public class Pubbing extends ToppingDecorator {

    private static final Double COST = 0.5;

    private Cost cost;

    public Pubbing(Cost cost){
        this.cost = cost;
    }

    @Override
    public Double cost() {
        return COST+this.cost.cost();
    }
}

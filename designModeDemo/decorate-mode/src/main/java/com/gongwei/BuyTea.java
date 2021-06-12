package com.gongwei;

import com.gongwei.decoretor.IceCube;
import com.gongwei.decoretor.Sugar;
import com.gongwei.drink.RedTea;

/**
 * description: 买茶
 *
 * @date: 2021/6/12 23:30
 * @author: gong.wei
 */
public class BuyTea {

    public static void main(String[] args) {
        Cost cost = new RedTea();
        cost = new IceCube(cost);
        cost = new Sugar(cost);
        System.out.println(cost.cost());
    }
}

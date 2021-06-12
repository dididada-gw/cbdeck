package com.gongwei.decoretor;

import com.gongwei.Cost;

/**
 * description: 模板
 *
 * @date: 2021/6/12 23:16
 * @author: gong.wei
 */
public abstract class ToppingDecorator extends Cost {

    @Override
    public abstract Double cost();
}

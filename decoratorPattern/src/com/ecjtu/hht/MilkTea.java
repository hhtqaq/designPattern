package com.ecjtu.hht;

/**
 * @author hht
 * @date 2019/7/27 16:59
 * @description 被装饰者：奶茶
 */
public class MilkTea extends Tea {
    MilkTea() {
        description = "奶茶";
    }

    @Override
    public double cost() {
        return 8;
    }
}

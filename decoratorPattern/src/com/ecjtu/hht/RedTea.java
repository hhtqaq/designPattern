package com.ecjtu.hht;

/**
 * @author hht
 * @date 2019/7/27 16:56
 * @description 被装饰者：红茶
 */
public class RedTea extends Tea {
    RedTea() {
        description = "红茶";
    }

    @Override
    public double cost() {
        //绿茶5块钱
        return 5;
    }
}

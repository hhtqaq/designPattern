package com.ecjtu.hht;

/**
 * @author hht
 * @date 2019/7/27 16:47
 * @description 抽象茶类
 */
public abstract class Tea {

    String description = "还不知道什么茶";

    public String getDescription() {
        return description;
    }

    /**
     * 价钱
     *
     * @return
     */
    public abstract double cost();
}

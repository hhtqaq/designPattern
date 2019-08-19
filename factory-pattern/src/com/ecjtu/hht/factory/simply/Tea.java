package com.ecjtu.hht.factory.simply;

/**
 * 所有茶的抽象父类
 *
 * @author hht
 * @date 2019/8/19 17:45
 */
public abstract class Tea {
    /**
     * 原材料
     */
    protected String originalMaerial;

    /**
     * 每个茶都有他自己的制作方法
     */
    abstract void make();
}

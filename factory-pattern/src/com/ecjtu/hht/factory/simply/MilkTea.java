package com.ecjtu.hht.factory.simply;

/**
 * @author hht
 * @date 2019/8/19 17:58
 */
public class MilkTea extends Tea {
    @Override
    void make() {
        System.out.println("奶加绿茶加糖,搅拌");
    }
}

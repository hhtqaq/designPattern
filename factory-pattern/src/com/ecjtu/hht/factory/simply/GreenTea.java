package com.ecjtu.hht.factory.simply;

/**
 * 绿茶实例继承Tea抽象类
 *
 * @author hht
 * @date 2019/8/19 17:44
 */
public class GreenTea extends Tea {

    @Override
    void make() {
        System.out.println("绿茶叶泡水");
    }
}

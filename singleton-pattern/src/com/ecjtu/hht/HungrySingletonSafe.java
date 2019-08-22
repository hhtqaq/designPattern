package com.ecjtu.hht;

/**
 * 饿汉式 线程安全
 * 类加载时就初始化  浪费内存
 *
 * @author hht
 * @date 2019/8/22 17:31
 */
public class HungrySingletonSafe {
    private static HungrySingletonSafe instance = new HungrySingletonSafe();

    private HungrySingletonSafe() {
    }

    public static HungrySingletonSafe getInstance() {
        return instance;
    }
}

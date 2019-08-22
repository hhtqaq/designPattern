package com.ecjtu.hht;

/**
 * 懒汉式 线程不安全
 *
 * @author hht
 * @date 2019/8/22 17:31
 */
public class LazySingletonSafe {
    private static LazySingletonSafe instance;

    private LazySingletonSafe() {
    }

    //效率低
    public static synchronized LazySingletonSafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonSafe();
        }
        return instance;
    }
}

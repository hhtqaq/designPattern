package com.ecjtu.hht;

/**
 * 懒汉式 线程不安全
 *
 * @author hht
 * @date 2019/8/22 17:31
 */
public class LazySingletonUnsafe {
    private static LazySingletonUnsafe instance;

    private LazySingletonUnsafe() {
    }

    public static LazySingletonUnsafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonUnsafe();
        }
        return instance;
    }
}

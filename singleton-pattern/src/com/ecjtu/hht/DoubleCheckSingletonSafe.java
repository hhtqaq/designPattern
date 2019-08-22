package com.ecjtu.hht;

/**
 * 双重检查 线程安全
 * 懒加载 效率高
 *
 * @author hht
 * @date 2019/8/22 17:31
 */
public class DoubleCheckSingletonSafe {
    private static volatile DoubleCheckSingletonSafe instance;

    private DoubleCheckSingletonSafe() {
    }

    public static DoubleCheckSingletonSafe getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingletonSafe.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingletonSafe();
                }
            }
        }
        return instance;
    }
}

package com.ecjtu.hht.simple;

/**
 * @author hht
 * @date 2019/7/26 16:37
 * @description 抽象观察者接口
 */
public interface MyObserver {
    /**
     * 通知
     *
     * @param msg 订阅的内容
     */
    void update(String msg);
}

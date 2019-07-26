package com.ecjtu.hht.simple;

/**
 * @author hht
 * @date 2019/7/26 16:34
 * @description 抽象主题接口
 */
public interface MySubject {
    /**
     * 订阅主题
     *
     * @param observer
     */
    void registerObserver(MyObserver observer);

    /**
     * 取消订阅
     *
     * @param observer
     */
    void removeObserver(MyObserver observer);

    /**
     * 通知方法
     */
    void notice();
}

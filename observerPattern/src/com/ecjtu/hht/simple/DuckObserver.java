package com.ecjtu.hht.simple;

/**
 * @author hht
 * @date 2019/7/26 16:53
 * @description 真实鸭子观察者
 */
public class DuckObserver implements MyObserver {
    private MySubject subject;

    DuckObserver(MySubject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("duck:我知道今天的新闻了，它是:" + msg);
    }
}

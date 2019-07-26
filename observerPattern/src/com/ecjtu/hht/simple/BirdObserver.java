package com.ecjtu.hht.simple;

/**
 * @author hht
 * @date 2019/7/26 17:04
 * @description 真实鸟类观察者
 */
public class BirdObserver implements MyObserver {
    private MySubject subject;

    BirdObserver(MySubject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("bird:哈哈哈，我知道这个消息：" + msg);
    }
}

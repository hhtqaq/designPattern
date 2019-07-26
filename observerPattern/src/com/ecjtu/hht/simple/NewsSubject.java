package com.ecjtu.hht.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hht
 * @date 2019/7/26 16:42
 * @description 真实新闻主题
 */
public class NewsSubject implements MySubject {
    List<MyObserver> observers = null;
    //订阅的内容
    private String msg;

    NewsSubject() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        int i = observers.indexOf(observer);
        if (i > 0) {
            observers.remove(i);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
        //消息改变时通知所有订阅者
        notice();
    }

    @Override
    public void notice() {
        observers.forEach(observer -> observer.update(msg));
    }
}

package com.ecjtu.hht.simple;

/**
 * @author hht
 * @date 2019/7/26 17:06
 * @description 测试简单版的观察者模式
 */
public class TestObserverPattern {
    public static void main(String[] args) {
        //创建新闻主题
        NewsSubject subject = new NewsSubject();
        //创建观察者  并绑定新闻主题
        MyObserver duckObserver = new DuckObserver(subject);
        MyObserver birdObserver = new BirdObserver(subject);
        //创建消息
        subject.setMsg("最近香港不太平，港独分子太嚣张");
    }
}

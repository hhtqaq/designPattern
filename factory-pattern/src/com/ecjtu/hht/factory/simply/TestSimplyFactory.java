package com.ecjtu.hht.factory.simply;

/**
 * 简单工厂测试类
 *
 * @author hht
 * @date 2019/8/19 17:58
 */
public class TestSimplyFactory {
    public static void main(String[] args) {

        SimpleTeaFactory teaFactory = new SimpleTeaFactory();
        Tea tea = teaFactory.createTea("green");
        tea.make();
    }
}

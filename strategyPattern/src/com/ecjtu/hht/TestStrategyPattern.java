package com.ecjtu.hht;

/**
 * @author hht
 * @date 2019/7/25 18:24
 * @description 测试类
 */
public class TestStrategyPattern {
    public static void main(String[] args) {
        Duck rocketDuck = new RocketDuck();
        rocketDuck.setFlyBehavior(new FlyWithRocket());
        rocketDuck.display();
        rocketDuck.peformFly();
        rocketDuck.setFlyBehavior(new FlyWithWings());
        rocketDuck.peformFly();
    }
}

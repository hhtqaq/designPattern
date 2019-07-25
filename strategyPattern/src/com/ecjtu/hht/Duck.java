package com.ecjtu.hht;

/**
 * @author hht
 * @date 2019/7/25 18:02
 * @description
 */
public abstract class Duck {
    public FlyBehavior flyBehavior;

    public void yell() {
        System.out.println("我们都会叫");
    }

    abstract void display();

    public void peformFly() {
        this.flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}

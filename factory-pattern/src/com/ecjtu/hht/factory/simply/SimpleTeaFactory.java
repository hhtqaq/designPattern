package com.ecjtu.hht.factory.simply;

/**
 * 茶工厂  生产茶
 *
 * @author hht
 * @date 2019/8/19 17:44
 */
public class SimpleTeaFactory {
    public Tea createTea(String type) {
        Tea tea = null;
        switch (type) {
            case "green":
                tea = new GreenTea();
                break;
            case "milk":
                tea = new MilkTea();
                break;
            default:
        }
        return tea;
    }
}

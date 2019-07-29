package com.ecjtu.hht;

/**
 * @author hht
 * @date 2019/7/27 17:13
 * @description 测试装饰者模式
 */
public class TestDecoratorPattern {
    public static void main(String[] args) {
        //1创建装饰者对象  ：一杯什么都不加的奶茶
        Tea milkTea = new MilkTea();
        System.out.println(milkTea.getDescription() + "," + milkTea.cost());
        //加珍珠
        milkTea = new CoconutIngredientsDecorator(milkTea);
        System.out.println(milkTea.getDescription() + "," + milkTea.cost());
        //加椰果
        milkTea=new PearlIngredientsDecorator(milkTea);
        System.out.println(milkTea.getDescription() + "," + milkTea.cost());

    }
}

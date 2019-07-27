package com.ecjtu.hht;

/**
 * @author hht
 * @date 2019/7/27 17:13
 * @description 测试装饰者模式
 */
public class TestDecoratorPattern {
    public static void main(String[] args) {
        //1创建装饰者对象  ：一杯什么都不加的奶茶
        MilkTea milkTea = new MilkTea();
        System.out.println(milkTea.getDescription() + "," + milkTea.cost());
        //加珍珠
        Tea redTea = new RedTea();
        CoconutIngredientsDecorator decorator = new CoconutIngredientsDecorator(redTea);
        redTea = new CoconutIngredientsDecorator(redTea);
        System.out.println(decorator.getDescription() + "," + decorator.cost());
        //加珍珠
        // System.out.println(redTea.getDescription() + "," + redTea.cost());
        // milkTea = new PearlIngredientsDecorator(milkTea);
        //多少钱？
        // System.out.println(milkTea.getDescription() + "," + milkTea.cost());
        //在加椰果
        //decorator = new PearlIngredientsDecorator(new CoconutIngredientsDecorator(milkTea));
        //多少钱？
        // System.out.println(decorator.description() + "," + decorator.cost());

    }
}

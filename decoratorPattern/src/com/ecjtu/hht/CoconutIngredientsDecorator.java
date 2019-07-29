package com.ecjtu.hht;

/**
 * @author hht
 * @date 2019/7/27 17:07
 * @description 椰果装饰者：
 */
public class CoconutIngredientsDecorator extends AbstractIngredientsDecorator {
    private Tea tea;

    CoconutIngredientsDecorator(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getDescription() {
        return "椰果" + tea.getDescription();
    }

    @Override
    public double cost() {
        return 2 + tea.cost();
    }
}

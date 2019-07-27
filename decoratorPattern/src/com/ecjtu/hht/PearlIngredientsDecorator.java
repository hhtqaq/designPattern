package com.ecjtu.hht;

/**
 * @author hht
 * @date 2019/7/27 17:11
 * @description 珍珠装饰者
 */
public class PearlIngredientsDecorator extends AbstractIngredientsDecorator {
    private Tea tea;

    PearlIngredientsDecorator(Tea tea) {
        super();
        this.tea = tea;
    }

    @Override
    public String description() {
        return "珍珠" + this.tea.getDescription();
    }

    @Override
    public double cost() {
        return 2 + tea.cost();
    }
}

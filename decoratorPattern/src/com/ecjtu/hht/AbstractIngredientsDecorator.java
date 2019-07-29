package com.ecjtu.hht;

/**
 * @author hht
 * @date 2019/7/27 17:01
 * @description 抽象 调料装饰者
 */
public abstract class AbstractIngredientsDecorator extends Tea {
    /**
     * 抽象方法  获取描述
     *
     * @return
     */
    @Override
    public abstract String getDescription();
}

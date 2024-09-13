package com.patterns.creational.factoryMethod;

public class ConcreteCreatorA extends Creator{
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}

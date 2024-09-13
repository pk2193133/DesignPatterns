package com.patterns.creational.factoryMethod;

public class ConcreteCreatorB extends Creator{


    @Override
    public Product getProduct() {
        return new ProductB();
    }
}

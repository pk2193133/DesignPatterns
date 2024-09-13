package com.patterns.creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Creator creator=new ConcreteCreatorB();
        System.out.println(creator.doSomethingBasedOnProduct());
    }
}

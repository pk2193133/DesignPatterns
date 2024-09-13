package com.patterns.creational.factoryMethod;

public abstract class Creator {
    Product product;
    public abstract Product getProduct();

    public String doSomethingBasedOnProduct(){
        product=getProduct();
        String productString=product.doSomething();
        return productString;
    }

}

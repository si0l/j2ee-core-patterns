package com.sub.patterns.business.businessDelegate;

public class EjbService implements BusinessService{

    @Override
    public void process() {
        System.out.println("Ejb processing");
    }
    
}

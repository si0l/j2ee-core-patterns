package com.sub.patterns.business.businessDelegate;

public class JmsService implements BusinessService {

    @Override
    public void process() {
        System.out.println("Jms processing");
    }

}

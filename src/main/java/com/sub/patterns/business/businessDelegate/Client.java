package com.sub.patterns.business.businessDelegate;

import javax.naming.NameNotFoundException;

public class Client {

    private BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask() throws NameNotFoundException {
        businessDelegate.doTask();
    }
}

package com.sub.patterns.business.businessDelegate;

import javax.naming.NameNotFoundException;

public class DelegateApp {

    public static void main(String[] args) throws NameNotFoundException {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        BusinessLookup businessLookup = new BusinessLookup();
        businessLookup.setEjbService(new EjbService());
        businessLookup.setJmsService(new JmsService());
        businessDelegate.setLookupService(businessLookup);
        businessDelegate.setServiceType("EJB");
        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();

        businessDelegate.setServiceType("unknown");
        client.doTask();

    }
}

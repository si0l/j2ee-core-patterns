package com.sub.patterns.business.businessDelegate;

import javax.naming.NameNotFoundException;

public class BusinessLookup {

    private EjbService ejbService;
    private JmsService jmsService;

    public BusinessService getBusinessService(String serviceType) throws NameNotFoundException {
        return switch (serviceType) {
            case "EJB" -> ejbService;
            case "JMS" -> jmsService;
            default -> throw new NameNotFoundException();
        };
    }

    public void setEjbService(EjbService ejbService) {
        this.ejbService = ejbService;
    }

    public void setJmsService(JmsService jmsService) {
        this.jmsService = jmsService;
    }

}

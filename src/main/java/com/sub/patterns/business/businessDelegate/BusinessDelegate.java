package com.sub.patterns.business.businessDelegate;

import javax.naming.NameNotFoundException;

public class BusinessDelegate {

    private BusinessLookup businessLookup;
    private BusinessService businessService;
    private String serviceType;

    public void setLookupService(BusinessLookup businessLookup) {
        this.businessLookup = businessLookup;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() throws NameNotFoundException {
        businessService = businessLookup.getBusinessService(serviceType);
        businessService.process();
    }

}

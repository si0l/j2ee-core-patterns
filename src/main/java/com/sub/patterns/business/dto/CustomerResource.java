package com.sub.patterns.business.dto;

import java.util.List;

public class CustomerResource {

    private List<CustomerDto> customers;

    public CustomerResource(List<CustomerDto> customers) {
        this.customers = customers;
    }

    public List<CustomerDto> getCustomers() {
        return customers;
    }

    public void save(CustomerDto customer) {
        customers.add(customer);
    }

    public void remove(String customerId) {
        customers.removeIf(customer -> customer.id().equals(customerId));
    }

}

package com.sub.patterns.business.dto;

import java.util.ArrayList;
import java.util.List;

public class DtoApp {

    public static void main(String[] args) {

        List<CustomerDto> customers = new ArrayList<>();
        CustomerDto customer1 = new CustomerDto("1", "firstName1", "lastName1");
        CustomerDto customer2 = new CustomerDto("2", "firstName2", "lastName2");
        customers.add(customer1);
        customers.add(customer2);
        CustomerResource customerResource = new CustomerResource(customers);

        System.out.println("Customers: ");
        customerResource.getCustomers().stream().forEach(System.out::println);

        System.out.println("Delete customer " + customers.get(1).id());
        customerResource.remove(customers.get(1).id());
        customerResource.getCustomers().stream().forEach(System.out::println);

    }

}

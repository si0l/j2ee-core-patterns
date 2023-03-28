package com.sub.patterns.business.converter;

import java.util.ArrayList;
import java.util.List;

public class ConverterApp {

    public static void main(String[] args) {

        Converter<CustomerDto, Customer> converter = new CustomerConverter();

        CustomerDto customerDto = new CustomerDto("1", "customerName1", "customerLastName1", true);
        Customer customer = converter.convertFromDto(customerDto);

        System.out.println(customer);

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("2", "customerName2", "customerLastName2", true));
        customers.add(new Customer("3", "customerName3", "customerLastName3", true));
        customers.add(new Customer("4", "customerName4", "customerLastName4", true));

        List<CustomerDto> customerDtos = converter.convertFromEntities(customers);
        System.out.println(customerDtos);

    }

}

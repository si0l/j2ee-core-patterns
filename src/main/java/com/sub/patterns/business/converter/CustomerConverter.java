package com.sub.patterns.business.converter;

public class CustomerConverter extends Converter<CustomerDto, Customer> {

    public CustomerConverter() {

        super(
                customerDto -> new Customer(
                        customerDto.customerDtoId(), customerDto.customerDtoName(),
                        customerDto.customerDtoLastName(), customerDto.statusDto()),
                customer -> new CustomerDto(
                        customer.customerId(), customer.customerName(),
                        customer.customerLastName(), customer.status()));

    }

}

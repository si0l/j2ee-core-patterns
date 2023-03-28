package com.sub.patterns.business.converter;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class Converter<T, C> {

    // dto entity to domain entity
    private final Function<T, C> fromDto;

    // domain entity to dto entity
    private final Function<C, T> fromEntity;

    public Converter(Function<T, C> fromDto, Function<C, T> fromEntity) {
        this.fromDto = fromDto;
        this.fromEntity = fromEntity;
    }

    public final C convertFromDto(final T customerDto) {

        return fromDto.apply(customerDto);
    }

    public final T convertFromEntity(final C customer) {

        return fromEntity.apply(customer);
    }

    public final List<C> convertFromDtos(final List<T> customerDtos) {

        return customerDtos.stream().map(this::convertFromDto).collect(Collectors.toList());
    }

    public final List<T> convertFromEntities(final List<C> customers){

       return customers.stream().map(this::convertFromEntity).collect(Collectors.toList());
    }

}

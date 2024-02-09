package com.example.blogexample.converter;

import com.example.blogexample.entity.Customer;

/**
 * Created by KimKyungHo on 2024-02-09(009)
 */
public class CustomerConverter {

    public Customer toEntity(com.example.blogexample.dto.Customer customer) {
        return Customer.builder()
            .password(customer.password())
            .email(customer.email())
            .nickname(customer.nickname())
            .build();
    }

    public com.example.blogexample.dto.Customer toResponse(Customer customer) {
        return com.example.blogexample.dto.Customer.response(customer.getEmail(), customer.getNickname());
    }
}

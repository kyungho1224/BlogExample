package com.example.blogexample.service;

import com.example.blogexample.converter.CustomerConverter;
import com.example.blogexample.dto.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by KimKyungHo on 2024-02-09(009)
 */

@RequiredArgsConstructor
@Service
public class BlogService {

    private final CustomerConverter customerConverter;

    public Customer postList() {
        com.example.blogexample.entity.Customer customer = com.example.blogexample.entity.Customer.builder()
            .password("")
            .email("")
            .nickname("")
            .build();

        return customerConverter.toResponse(customer);
    }
}

package com.example.blogexample.controller;

import com.example.blogexample.dto.Customer;
import com.example.blogexample.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by KimKyungHo on 2024-02-09(009)
 */

@RequiredArgsConstructor
@RestControllerAdvice
@RequestMapping("/api/blog")
public class BlogController {

    private final BlogService blogService;

    @GetMapping("/post")
    public ResponseEntity<Customer> getPostList() {
        Customer customer = blogService.postList();
        return ResponseEntity.ok(customer);
    }

}

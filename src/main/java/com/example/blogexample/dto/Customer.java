package com.example.blogexample.dto;

/**
 * Created by KimKyungHo on 2024-02-09(009)
 */
public record Customer(
    String password,
    String email,
    String nickname
) {

    public static Customer register(String password, String email, String nickname) {
        return new Customer(password, email, nickname);
    }

    public static Customer login(String password, String email) {
        return new Customer(password, email, "");
    }
}

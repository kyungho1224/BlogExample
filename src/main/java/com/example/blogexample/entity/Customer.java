package com.example.blogexample.entity;

import java.time.LocalDateTime;

/**
 * Created by KimKyungHo on 2024-02-09(009)
 */

public class Customer {

    private Long id;

    private String password;
    private String email;
    private String nickname;

    private LocalDateTime registeredAt;
    private LocalDateTime modifiedAt;
}

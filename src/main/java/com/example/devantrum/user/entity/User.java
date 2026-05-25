package com.example.devantrum.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private Integer age;
    private Long phoneNumber;
    private String password;
    private String bio;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String avatarUrl;
}

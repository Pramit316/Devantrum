package com.example.devantrum.user.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDto {
    @Id
    private Long id;
    private String name;
    private Integer age;
    private Long phoneNumber;
    private String bio;
    private String avatarUrl;
}

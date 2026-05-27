package com.example.devantrum.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
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

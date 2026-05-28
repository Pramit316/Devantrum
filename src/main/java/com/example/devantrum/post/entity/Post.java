package com.example.devantrum.post.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "post")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipped; // what I built today

    private String building; // what I'm, working on tomorrow

    private String blocker; //optional

    private Visibility visibility = Visibility.PUBLIC;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

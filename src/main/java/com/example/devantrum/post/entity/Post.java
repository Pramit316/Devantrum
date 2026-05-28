package com.example.devantrum.post.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")
public class Post {

    @Id
    private Long id;

    private String shipped; // what I built today

    private String building; // what I'm, working on tomorrow

    private String blocker; //optional

    private Visibility visibility = Visibility.PUBLIC;
}

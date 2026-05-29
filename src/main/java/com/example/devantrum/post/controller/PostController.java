package com.example.devantrum.post.controller;

import com.example.devantrum.post.entity.Post;
import com.example.devantrum.post.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/post")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<Post> addPost(@RequestBody Post post){
        return ResponseEntity.status(HttpStatus.CREATED).body(postService.addPost(post));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id){
        return ResponseEntity.ok(postService.getPostById(id));
    }

    @GetMapping
    public ResponseEntity<List<Post>> getAllPost(){
        return ResponseEntity.ok(postService.getAllPost());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> updatePost(@RequestBody Post post, @PathVariable Long id){
        return ResponseEntity.ok(postService.updatePost(post, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id){
        postService.deletePost(id);
        return  ResponseEntity.noContent().build();
    }
}

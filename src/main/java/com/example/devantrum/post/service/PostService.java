package com.example.devantrum.post.service;

import com.example.devantrum.post.entity.Post;
import com.example.devantrum.post.repository.PostRepository;
import com.example.devantrum.user.entity.User;
import com.example.devantrum.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public PostService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    public Post getPostById(Long id){
        return postRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Post addPost(Post post) {
        return postRepository.save(post);
    }

    public void deletePost(Long id) {
        Post post = getPostById(id);
        postRepository.delete(post);
    }
}

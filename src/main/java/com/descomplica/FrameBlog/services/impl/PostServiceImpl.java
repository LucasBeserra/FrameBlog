package com.descomplica.FrameBlog.services.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.descomplica.FrameBlog.models.Post;
import com.descomplica.FrameBlog.repositories.PostRepository;
import com.descomplica.FrameBlog.services.PostService;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public Post savePost(Post post) {
        Post existingPost = postRepository.findPostById(post.getPostId());

        if(Objects.isNull(existingPost)) {
            throw new RuntimeException("Post already exists");
        }

        Post entity = new Post(post.getPostId(), post.getTitle(), post.getContent(), post.getDate(), post.getUserId());

        Post newPost = postRepository.save(entity);

        return new Post(newPost.getPostId(), newPost.getTitle(), newPost.getContent(), newPost.getDate(), newPost.getUserId());
    }
}

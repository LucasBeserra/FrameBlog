package com.descomplica.FrameBlog.services;

import java.util.List;

import com.descomplica.FrameBlog.models.Post;

public interface PostService {

    Post savePost(Post post);

    List<Post> getAllPosts();

}

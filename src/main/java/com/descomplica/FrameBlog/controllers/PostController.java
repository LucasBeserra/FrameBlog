package com.descomplica.FrameBlog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.descomplica.FrameBlog.models.Post;
import com.descomplica.FrameBlog.services.PostService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/save")
    public @ResponseBody Post saveTag(@RequestBody Post post) {
        return postService.savePost(post);
    }

    @GetMapping("/getAll")
    public @ResponseBody List<Post> getAllPosts() {
        return postService.getAllPosts();
    }
    
    

}

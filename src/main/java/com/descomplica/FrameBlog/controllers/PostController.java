package com.descomplica.FrameBlog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.descomplica.FrameBlog.models.Post;
import com.descomplica.FrameBlog.services.PostService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




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

    @GetMapping(path = "/getById/{id}")
    public @ResponseBody Post getPostById(@RequestParam Long id) {
        return postService.getPostById(id);
    }

    @PostMapping(path = "/update")
    public @ResponseBody Post updatePost(@RequestParam final Long id, @RequestBody final Post post) {
        return postService.updatePost(id, post);
    }

    @GetMapping(path = "/delete/{id}")
    public ResponseEntity<?> delete(@RequestParam final Long id) {
        postService.deletePost(id);
        return ResponseEntity.noContent().build();
    }
    

    
    

}

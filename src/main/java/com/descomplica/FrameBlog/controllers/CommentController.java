package com.descomplica.FrameBlog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.descomplica.FrameBlog.models.Comment;
import com.descomplica.FrameBlog.services.CommentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/save")
    public @ResponseBody Comment saveUser(@RequestBody Comment comment) {  
        return commentService.saveComment(comment);
    }

    @GetMapping(path = "/getAll")
    public @ResponseBody List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @GetMapping(path = "/getById/{id}")
    public @ResponseBody Comment getCommentById(@RequestParam Long id) {
        return commentService.getCommentById(id);
    }
    
    @PostMapping(path = "/update")
    public @ResponseBody Comment updateComment(@RequestParam final Long id, @RequestBody final Comment comment) {
        return commentService.updateComment(id, comment);
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<?> delete(@RequestParam final Long id) {
        commentService.deleteComment(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(path = "/")
    public @ResponseBody String authentication() {
        return "Autenticação efetuada com sucesso";
    }
    
}

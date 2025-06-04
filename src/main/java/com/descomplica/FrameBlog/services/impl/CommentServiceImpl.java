package com.descomplica.FrameBlog.services.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.descomplica.FrameBlog.models.Comment;
import com.descomplica.FrameBlog.repositories.CommentRepository;
import com.descomplica.FrameBlog.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment saveComment(Comment comment) {
        Comment existingComment = commentRepository.findCommentById(comment.getCommentId());
        
        if(Objects.isNull(existingComment)) {
            throw new RuntimeException("Comment already exists");
        }
        
        Comment entity = new Comment(comment.getCommentId(), comment.getContent(), comment.getDate(), comment.getPostId(), comment.getUserId());
        
        Comment newComment = commentRepository.save(entity);
        
        return new Comment(newComment.getCommentId(), newComment.getContent(), newComment.getDate(), newComment.getPostId(), newComment.getUserId());)
    }
}

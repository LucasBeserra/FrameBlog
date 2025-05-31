package com.descomplica.FrameBlog.services;

import java.util.List;

import com.descomplica.FrameBlog.models.Comment;

public interface CommentService {

    Comment saveComment(Comment comment);

    List<Comment> getAllComments();

    Comment getCommentById(Long id);

    Comment updateComment(Long id, Comment comment);

    void deleteComment(Long id);

}

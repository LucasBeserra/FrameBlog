package com.descomplica.FrameBlog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.descomplica.FrameBlog.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Comment findCommentById(Long id);
}

package com.descomplica.FrameBlog.repositories;

import org.springframework.stereotype.Repository;
import com.descomplica.FrameBlog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Post findPostById(Long id);
}

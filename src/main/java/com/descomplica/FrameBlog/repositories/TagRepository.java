package com.descomplica.FrameBlog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.descomplica.FrameBlog.models.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
}

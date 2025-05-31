package com.descomplica.FrameBlog.repositories;

import org.springframework.stereotype.Repository;
import com.descomplica.FrameBlog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String name);

}

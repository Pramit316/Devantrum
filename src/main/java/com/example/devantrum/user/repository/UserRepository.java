package com.example.devantrum.user.repository;

import com.example.devantrum.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

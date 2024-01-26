package com.example.demoblogapi2.repository;


import com.example.demoblogapi2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

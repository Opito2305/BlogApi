package com.example.demoblogapi2.repository;

import com.example.demoblogapi2.model.Blog;

import com.example.demoblogapi2.model.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BlogRepository extends JpaRepository<Blog,Long> {
    @Query("SELECT b FROM Blog b WHERE b.userId = :userId AND UPPER(b.status) LIKE UPPER(CONCAT('%', :status, '%'))")
    List<Blog> findAllByUserIdAndAndStatusContainingIgnoreCase(Long userId, String status);

    List<Blog> findAllByStatusContainingIgnoreCase(String status);
    List<Blog> findAllByOrderByLikeCount();

    List<Blog> findAllByOrderByLikeCountDesc();
    List<Blog> findTop4ByOrderByLikeCountDesc();

}

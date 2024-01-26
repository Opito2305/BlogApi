package com.example.demoblogapi2.model;

import jakarta.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private String title;
    private Double likeCount;
    private String status;
    @ManyToOne
    private User user;

    public Blog(Long id, String content, String title, Double likeCount, String status, User user) {
        this.id = id;
        this.content = content;
        this.title = title;
        this.likeCount = likeCount;
        this.status = status;
        this.user = user;
    }

    public Blog() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Double likeCount) {
        this.likeCount = likeCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

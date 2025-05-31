package com.descomplica.FrameBlog.models;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commentId;
    private String content;
    private Date date;



    public Comment(Long commentId, String content, Date date, Post postId, User userId) {
        this.commentId = commentId;
        this.content = content;
        this.date = date;
        this.postId = postId;
        this.userId = userId;
    }
    @ManyToOne
    private Post postId;
    public Long getCommentId() {
        return commentId;
    }
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Post getPostId() {
        return postId;
    }
    public void setPostId(Post postId) {
        this.postId = postId;
    }
    public User getUserId() {
        return userId;
    }
    public void setUserId(User userId) {
        this.userId = userId;
    }
    @ManyToOne
    private User userId;
}

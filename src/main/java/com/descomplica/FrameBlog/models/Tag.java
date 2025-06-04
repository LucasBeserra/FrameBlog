package com.descomplica.FrameBlog.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tagId;
    private String name;
    private Long postId;

    public Tag(final Long tagId, final String name, final Long postId) {
        this.tagId = tagId;
        this.name = name;
        this.postId = postId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    

}

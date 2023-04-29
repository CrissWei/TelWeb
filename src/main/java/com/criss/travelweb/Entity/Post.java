package com.criss.travelweb.Entity;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Post {
    private Integer postId;
    private String postTitle;
    private String postContent;
    private String postLike;
    private String postComment;
}

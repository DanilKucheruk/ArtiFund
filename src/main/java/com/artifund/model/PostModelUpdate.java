package com.artifund.model;

import com.artifund.entity.post.PostStatus;

import lombok.Value;

@Value
public class PostModelUpdate {
    private String id;
	private String title;
	private String description;
	private PostStatus status;
}

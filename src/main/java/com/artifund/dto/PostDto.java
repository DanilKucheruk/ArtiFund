package com.artifund.dto;

import com.artifund.entity.post.PostStatus;

import lombok.Value;

@Value
public class PostDto {
    private String videoId;
	private String contentType;
	private String title;
	private String description;
	private Integer views;
	private PostStatus status;
	private String streamUrl;
    private LevelDto level;
}

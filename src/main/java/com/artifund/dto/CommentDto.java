package com.artifund.dto;

import java.time.LocalDateTime;

import lombok.Value;

@Value
public class CommentDto {
    private Long id;
	private String message;
	private String postId;
	private LocalDateTime createdAt;
	private UserDto user;
	private Boolean change = false;
}

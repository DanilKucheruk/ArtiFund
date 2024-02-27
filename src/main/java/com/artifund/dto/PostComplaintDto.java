package com.artifund.dto;

import java.time.LocalDateTime;

import com.artifund.entity.post.PostComplaintStatus;
import com.artifund.entity.post.ReasonPost;

import lombok.Value;

@Value
public class PostComplaintDto {
    private Long complaintId;
	private UserDto user;
	private String description;
	private ReasonPost reason;
	private PostDto video;
	private LocalDateTime createdAt;
	private PostComplaintStatus status;
}

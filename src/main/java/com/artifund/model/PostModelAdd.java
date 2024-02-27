package com.artifund.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Value;

@Value
public class PostModelAdd {
    private String title;
	private String description;
	private MultipartFile video;
}

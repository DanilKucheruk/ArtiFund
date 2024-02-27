package com.artifund.dto;

import com.artifund.entity.stats.GradePostStatus;

import lombok.Value;

@Value
public class GradePostDto {
    private Long countLikes;
	private Long countDislikes;
	private GradePostStatus givenStatus;
}

package com.artifund.service;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import com.artifund.dto.CommentDto;
import com.artifund.dto.GradePostDto;
import com.artifund.entity.stats.GradePostStatus;

public interface StatsPostService {
    void addPostGrade(Principal principal, String postId, Optional<GradePostStatus> grade);

	GradePostDto getPostDtoByPostId(String postId, Principal principal);

	List<CommentDto> getCommentsPost(String postId, Principal principal);

	void addCommentPost(String postId, String message, String name);

	void deleteCommentPost(Principal principal, String postId, Long commentId);

	void updateCommentPost(String message, String postId, String name, Long commentId);

}

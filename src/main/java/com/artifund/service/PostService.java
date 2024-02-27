package com.artifund.service;

import java.security.Principal;
import java.util.List;

import com.artifund.dto.PostDto;
import com.artifund.model.PostModelAdd;
import com.artifund.model.PostModelUpdate;

import jakarta.servlet.http.HttpServletRequest;

public interface PostService {
   PostDto getVideoById(String postId, HttpServletRequest request, Principal principal);
	
	void saveNewPost(PostModelAdd request, String userName);

	List<PostDto> getAllGradeVideoFromUser(String principal);

	void deletePostById(String postId, String principal);

	void updatePost(PostModelUpdate postModel, String principal);

	void updateMoreVideo(List<PostModelUpdate> postModels, String name);

	void recoveryPostById(String videoId);

	void recoveryMorePost(String[] listVideoId);
}

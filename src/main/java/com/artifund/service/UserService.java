package com.artifund.service;

import java.util.List;

import com.artifund.dto.PostDto;
import com.artifund.dto.UserDto;
import com.artifund.entity.user.UserEntity;
import com.artifund.model.UserModel;

public interface UserService {

    List<PostDto> getAccessPostFromUser(Long userId);

    List<PostDto> getAllGradePostUser(Long userId);

	UserDto getInfoFromUser(Long userId);

	void updateUserProfile(String principal, UserModel userModel);

	void deleteUserProfile(String principal);

	void blockUserByUserId(Long userId);

	void unblockUserByUserId(Long userId);

	List<UserDto> getBlockAndDeleteUsers();

	void blockUserByAuthorChannel(String name, Long userId, Long timeSec);
	
	void unblockUserByAuthorChannel(UserEntity blockUser, UserEntity authorChannel);

	void unblockUserByAuthorChannel(String authorChannel, Long blockUserId);


}

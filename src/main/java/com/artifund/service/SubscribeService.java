package com.artifund.service;

import java.util.List;

import com.artifund.dto.UserDto;

public interface SubscribeService {
    List<UserDto> getUserSubscribers(String name);

	List<UserDto> getUserSubscriptions(String name);

	void addSubscription(Long userId, String name);

	void deleteSubscription(Long userId, String name);
}
package com.artifund.dto;

import com.artifund.entity.user.UserRole;

import lombok.Value;

@Value
public class UserDto {
    private Long id;
	private String username;
	private String email;
	private UserRole role;
}

package com.artifund.entity.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Permission {
    USER_READ("user:read"),
    USER_WRITE("user:write");
    
    private final String permission;
}

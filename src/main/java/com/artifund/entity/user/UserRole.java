package com.artifund.entity.user;

import java.util.Set;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

@Getter
@AllArgsConstructor
public enum UserRole {
		CREATOR(Set.of(Permission.USER_READ)),
		ADMIN(Set.of(Permission.USER_READ, Permission.USER_WRITE));
		
		private final Set<Permission> permissions;
		
		public Set<SimpleGrantedAuthority> getAuthorities(){
			return getPermissions().stream()
					.map(perm -> new SimpleGrantedAuthority(perm.getPermission()))
					.collect(Collectors.toSet());
		}
}
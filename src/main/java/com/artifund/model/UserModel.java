package com.artifund.model;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class UserModel {
    @NotNull
	private String userName;
	@NotNull
	private String email;
	private String password;
	private Boolean accessToGradeVideo=true;
}

package com.artifund.entity.user;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.artifund.entity.post.AcceptedComplaint;
import com.artifund.entity.post.PostComplaintEntity;
import com.artifund.entity.post.PostEntity;
import com.artifund.entity.stats.CommentEntity;
import com.artifund.entity.stats.GradePost;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String username;
    private String email;
    private String password;
    private Boolean active = true;
    private LocalDateTime createdAt = LocalDateTime.now();
	private LocalDateTime deletedAt;
	private LocalDateTime blockedAt;
    @OneToMany(mappedBy="user", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private Set<PostEntity> posts = new HashSet<>();
	@Enumerated(value = EnumType.STRING)
	private UserRole role = UserRole.CREATOR;
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.REMOVE, mappedBy="user")
	private Set<GradePost> gradePost = new HashSet<>();
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.REMOVE, mappedBy="user")
	private List<CommentEntity> comments = new LinkedList<>();
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.REMOVE, mappedBy="user")
	private List<PostComplaintEntity> complaints = new LinkedList<>();
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.REMOVE, mappedBy="authorVideo")
	private List<AcceptedComplaint> authorPosts = new LinkedList<>();
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.REMOVE, mappedBy="complaintUser")
	private List<AcceptedComplaint> complaintUsers = new LinkedList<>();
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.REMOVE, mappedBy="authorChannel")
	private List<BlockUserEntity> blockUsers = new LinkedList<>();
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.REMOVE, mappedBy="authorChannel")
	private List<CommentEntity> commentsMyPosts = new LinkedList<>();    
}

package com.artifund.entity.post;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.artifund.entity.stats.CommentEntity;
import com.artifund.entity.stats.GradePost;
import com.artifund.entity.user.UserEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="post")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostEntity {
    @Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	private String title;
	private String description;
	@Enumerated(value=EnumType.STRING)
	private PostStatus status = PostStatus.PUBLIC;
	private Integer views=0;
	private String contentType;
	private LocalDateTime createdAt = LocalDateTime.now();
	private LocalDateTime deletedAt;
	private LocalDateTime blockedAt;
	@Enumerated(value=EnumType.STRING)
	private PostStatus oldStatusVideo;
	@ManyToOne(cascade=CascadeType.REFRESH, fetch=FetchType.LAZY)
	private UserEntity user;
	@OneToMany(mappedBy="post", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<PostUniqueViews> viewsList;
	@OneToMany(mappedBy="post", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private Set<GradePost> grades = new HashSet<>();
	@OneToMany(mappedBy="post", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<CommentEntity> comments = new LinkedList<>();
    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.REFRESH)
    private SubscribeLevelEntity subscribeLevel;
}

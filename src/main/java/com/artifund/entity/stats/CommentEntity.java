package com.artifund.entity.stats;

import java.time.LocalDateTime;

import com.artifund.entity.post.PostEntity;
import com.artifund.entity.user.UserEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="comment")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false, exclude = {"user", "post", "authorChannel"})
public class CommentEntity {
    @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String message;
	private LocalDateTime createdAt=LocalDateTime.now();
	private LocalDateTime deletedAt;
	private Boolean change = false;
	@Enumerated(value = EnumType.STRING)
	private CommentStatus status = CommentStatus.ACTIVE;
	@Enumerated(value = EnumType.STRING)
	private CommentStatus oldStatus;
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.REFRESH)
	private UserEntity user;
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.REFRESH)
	private PostEntity post;
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.REFRESH)
	private UserEntity authorChannel;
	
}

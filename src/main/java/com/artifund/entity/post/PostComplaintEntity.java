package com.artifund.entity.post;

import java.time.LocalDateTime;

import com.artifund.entity.user.UserEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="post_complaint")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostComplaintEntity {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.REFRESH)
	private UserEntity user;
	private String description;
	private LocalDateTime createdAt = LocalDateTime.now();
	@Enumerated(value = EnumType.STRING)
	private ReasonPost reason;
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.REFRESH)
	private PostEntity post;
	@Enumerated(value = EnumType.STRING)
	private PostComplaintStatus status = PostComplaintStatus.CONSIDERATION;
}

package com.artifund.entity.stats;

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
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradePost {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long gradeId;
	@ManyToOne(cascade=CascadeType.REFRESH, fetch=FetchType.LAZY)
	private UserEntity user;
	@ManyToOne(cascade=CascadeType.REFRESH, fetch=FetchType.LAZY)
	private PostEntity post;
	@Enumerated(value = EnumType.STRING)
	private GradePostStatus status;
}

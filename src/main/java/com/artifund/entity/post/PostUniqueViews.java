package com.artifund.entity.post;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name="post_views")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostUniqueViews {
    @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="viewers_id")
	private Long id;
	private String dataViewers;
	private LocalDateTime createdAt = LocalDateTime.now();
	@ManyToOne(cascade=CascadeType.REFRESH, fetch=FetchType.LAZY)
	private PostEntity post;
}

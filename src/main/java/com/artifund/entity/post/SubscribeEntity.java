package com.artifund.entity.post;


import com.artifund.entity.user.UserEntity;

import jakarta.persistence.CascadeType;
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
@Table(name="subscribe")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscribeEntity {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.REFRESH)
	private UserEntity subscribe; 
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.REFRESH)
	private UserEntity subscription;
}

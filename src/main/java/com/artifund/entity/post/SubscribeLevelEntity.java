package com.artifund.entity.post;

import java.math.BigDecimal;

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
@Table(name="subscribe_level")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscribeLevelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private String description;
    private BigDecimal cost;
    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.REFRESH)
	private UserEntity author;
}

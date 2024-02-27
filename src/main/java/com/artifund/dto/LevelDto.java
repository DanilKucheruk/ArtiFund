package com.artifund.dto;

import java.math.BigDecimal;

import lombok.Value;

@Value
public class LevelDto {
    private String title;
    private String description;
    private BigDecimal cost;
}

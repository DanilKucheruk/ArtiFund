package com.artifund.service;

import java.util.List;

import com.artifund.dto.LevelDto;

public interface SubscribeLevelService {
    void deleteLevelById(Long levelId);
    void addSubscribe(LevelDto levelDto);
    List<LevelDto> getAllLevelByUser(Long id);
}

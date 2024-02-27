package com.artifund.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artifund.entity.user.BlockUserEntity;
import com.artifund.entity.user.UserEntity;
import java.util.List;



@Repository
public interface BlockUserRepository extends JpaRepository<BlockUserEntity, Long>{
    void deleteAllByBlockedTimeBefore(LocalDateTime now);
    void deleteByBlockUser(UserEntity blockUser);
    List<BlockUserEntity> findByAuthorChannel(UserEntity authorChannel);
    long countByAuthorChannel(UserEntity authorChannel);
}

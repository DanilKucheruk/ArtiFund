package com.artifund.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artifund.entity.user.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
    Optional<UserEntity> findByEmailAndDeletedAt(String email, Object object);

	Optional<UserEntity> findByIdAndDeletedAt(Long Id, Object object);

	Optional<UserEntity> findByEmail(String email);

	void deleteAllByDeletedAtBefore(LocalDateTime minusMonths);

	Optional<UserEntity> findByEmailAndActive(String userName, boolean b);

	Optional<UserEntity> findBIdAndDeletedAtAndActive(Long userId, Object object, boolean b);
    List<UserEntity> findAllByIdAndDeletedAtAndActive(Long id, LocalDateTime deletedAt, Boolean active);

	Optional<UserEntity> findByUserIdAndActive(Long userId, boolean b);

	List<UserEntity> findAllByActive(boolean b);
}

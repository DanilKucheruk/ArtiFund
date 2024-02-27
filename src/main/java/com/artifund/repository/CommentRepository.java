package com.artifund.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artifund.entity.stats.CommentEntity;
import java.util.List;
import java.util.Optional;

import com.artifund.entity.post.PostEntity;
import com.artifund.entity.user.UserEntity;
import com.artifund.entity.stats.CommentStatus;



@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long>{
    List<CommentEntity> findAllByPost(PostEntity post);
    Optional<CommentEntity> findByUserAndPostAndStatus(UserEntity user, PostEntity post, CommentStatus status);

}

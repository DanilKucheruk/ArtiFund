package com.artifund.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artifund.entity.post.PostEntity;
import com.artifund.entity.stats.GradePost;
import com.artifund.entity.stats.GradePostStatus;
import com.artifund.entity.user.UserEntity;

@Repository
public interface GradePostRepository extends JpaRepository<GradePost, Long>{
    Optional<GradePost> findByPostAndUser(PostEntity post, UserEntity user);
    
    Optional<GradePostStatus> findStatusByPostAndUser(PostEntity post, UserEntity user); 

    List<GradePostStatus> findAllStatusByPost(PostEntity post);
}

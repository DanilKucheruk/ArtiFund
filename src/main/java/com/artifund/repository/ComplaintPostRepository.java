package com.artifund.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artifund.entity.post.PostComplaintEntity;
import java.util.List;
import java.util.Optional;

import com.artifund.entity.post.PostEntity;
import com.artifund.entity.user.UserEntity;



@Repository
public interface ComplaintPostRepository extends JpaRepository<PostComplaintEntity,Long>{
    List<PostComplaintEntity> findAllByPost(PostEntity post);
    Optional<PostComplaintEntity> findByUserAndPost(UserEntity user, PostEntity post);
}

package com.artifund.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artifund.entity.post.AcceptedComplaint;
import com.artifund.entity.user.UserEntity;
import java.util.List;
import java.util.Optional;

import com.artifund.entity.post.PostEntity;

@Repository
public interface AcceptedComplaintRepository extends JpaRepository<AcceptedComplaint, Long> {
    long countByAuthorPost(UserEntity authorPost);
    Optional<AcceptedComplaint> findByAuthorPost(UserEntity authorPost);
    List<AcceptedComplaint> findAllByPost(PostEntity post);

}

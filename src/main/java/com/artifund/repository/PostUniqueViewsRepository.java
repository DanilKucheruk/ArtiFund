package com.artifund.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artifund.entity.post.PostEntity;
import com.artifund.entity.post.PostUniqueViews;

@Repository
public interface PostUniqueViewsRepository extends JpaRepository<PostUniqueViews, Long>{
    Optional<PostUniqueViews> findByDataViewers(String sha1);

	Optional<PostUniqueViews> findByDataViewersAndVideo(String viewersData, PostEntity video);
}

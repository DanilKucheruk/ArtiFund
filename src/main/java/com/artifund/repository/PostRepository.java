package com.artifund.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.artifund.entity.post.PostEntity;
import com.artifund.entity.post.PostStatus;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long>{


    @Query(nativeQuery=true, value="SELECT * FROM post WHERE id=?1 AND level=?2")
	Optional<PostEntity> findPostByIdAndSubLevel(String postId, String level);

    @Query(nativeQuery=true, value="SELECT * FROM post WHERE id=?1 AND level=?2 AND status=?3")
	Optional<PostEntity> findPostByIdAndSubLevelAndStatus(String postId, String level, String status);

    @Query(nativeQuery=true, value="SELECT * FROM post WHERE id=?1 AND status!=?2 AND status!=?3 AND user_user_id=?4")
	Optional<PostEntity> findPostByIdAndIsNotStatusAndUserId(String postId, String delete, String block, Long userId);

    void deleteAllByDeletedAtBefore(LocalDateTime minusMonths);

	List<PostEntity> findAllByDeletedAtBefore(LocalDateTime minusMonths);

    Optional<PostEntity> findByVideoIdAndStatus(String videoId, PostStatus status);

    @Query(value = "SELECT * FROM post p JOIN subscribe_level l ON p.level_id = l.id WHERE l.id = :subscribeLevelId AND p.status = 'PUBLIC'", nativeQuery = true)
    List<PostEntity> findAllPublicPostsBySubscribeLevelIdNative(@Param("subscribeLevelId") Long subscribeLevelId);

	@Query(nativeQuery = true, value = "SELECT * FROM post p "
		+ "INNER JOIN subscribe_level sl ON p.level_id = sl.id "
		+ "INNER JOIN grade_video gv ON p.id = gv.video_video_id "
		+ "INNER JOIN user_ u ON u.access_to_grade_video = gv.id "
		+ "WHERE u.id = :userId AND gv.status = :statusGrade "
		+ "AND (p.status = :statusVideo OR p.status = :statusVideo2)")
    List<PostEntity> findAllGradeVideoUserAndStatus(
        @Param("userId") Long userId,
        @Param("statusGrade") String statusGrade,
        @Param("statusVideo") String statusVideo,
        @Param("statusVideo2") String statusVideo2
    );
}
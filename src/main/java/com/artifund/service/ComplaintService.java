package com.artifund.service;

import java.security.Principal;
import java.util.List;

import com.artifund.dto.PostComplaintDto;
import com.artifund.entity.post.PostComplaintStatus;
import com.artifund.entity.post.ReasonPost;

public interface ComplaintService {
    void addComplaintPost(String postId, String description, ReasonPost reason, Principal principal);

	List<PostComplaintDto> getComplaintsPost(String PostId);

	List<PostComplaintDto> getComplaintsByUser(String userName);

	void updateStatusComplaint(Long complaintId, PostComplaintStatus status);

	void deleteComplaintAndRecoveryPost(Long complaintId);
}
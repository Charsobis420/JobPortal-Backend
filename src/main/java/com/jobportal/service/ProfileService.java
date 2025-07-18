package com.jobportal.service;

import java.util.List;

import com.jobportal.dto.ProfileDTO;
import com.jobportal.exception.JobPortalException;

public interface ProfileService {
	public Long createProfile(String email) throws JobPortalException;
	public ProfileDTO getProfileDTO(Long id) throws JobPortalException;
	public ProfileDTO updateProfileDTO(ProfileDTO profileDTO) throws JobPortalException;
	public List<ProfileDTO> getAllProfiles();
	
}

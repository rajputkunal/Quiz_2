package com.courd.operatsions.services;

import com.courd.operatsions.entity.PidSegmentEntity;


public interface PidSegmentService {

	public PidSegmentEntity searchPidSegment(String uniqueId);

	public PidSegmentEntity savePidsegment(PidSegmentEntity entity);
	
	public Integer updateData(PidSegmentEntity entity);
 
	public void deleteByUniqueId(PidSegmentEntity entity);
}

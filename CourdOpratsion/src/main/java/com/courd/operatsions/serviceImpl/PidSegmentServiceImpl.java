package com.courd.operatsions.serviceImpl;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courd.operatsions.entity.PidSegmentEntity;
import com.courd.operatsions.repository.PidSegmentRepository;
import com.courd.operatsions.services.PidSegmentService;

@Service
public class PidSegmentServiceImpl implements PidSegmentService {

	@Autowired
	private PidSegmentRepository pidRepo;

	@Override
	public PidSegmentEntity searchPidSegment(String uniqueId) {
		return pidRepo.findByUniqueId(uniqueId);

	}

	public PidSegmentEntity savePidsegment(PidSegmentEntity entity) {

		return pidRepo.save(entity);
	}

	@Override
	public Integer updateData(PidSegmentEntity entity) {
		Integer Status=0;
		
			Status = pidRepo.updateData(entity.getFirstName(), entity.getPhysicianName(), entity.getUniqueId());
		
		return Status;
	}

	@Override
	public void deleteByUniqueId(PidSegmentEntity entity) {
		pidRepo.deleteById(entity);
		
	}

	

	




	
}

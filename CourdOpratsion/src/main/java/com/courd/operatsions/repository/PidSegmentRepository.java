package com.courd.operatsions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.courd.operatsions.entity.PidSegmentEntity;

@Repository
public interface PidSegmentRepository extends JpaRepository<PidSegmentEntity, Long> {

	public PidSegmentEntity findByUniqueId(final String uniqueId);

	
	  @Modifying
	  @Query("update PidSegmentEntity p set\r\n" + 
	  		"	  p.firstName=:firstName,p.physicianName=:physicianName where\r\n" + 
	  		"	  uniqueId=:uniqueId")
	 public Integer updateData(@Param("firstName") String firstName, @Param("physicianName") String physicianName,
			@Param("uniqueId") String uniqueId);
	  
	  void deleteById(PidSegmentEntity entity);   

}

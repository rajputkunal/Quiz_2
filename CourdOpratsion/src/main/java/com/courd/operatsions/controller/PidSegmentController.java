package com.courd.operatsions.controller;

import javax.swing.text.Segment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.courd.operatsions.entity.PidSegmentEntity;
import com.courd.operatsions.services.PidSegmentService;

@CrossOrigin
@RestController
public class PidSegmentController {
	
	@Autowired
	private PidSegmentService service;

	@GetMapping("/search")
	ResponseEntity<Object> searchPidSegment(@RequestParam String uniqueId){
		PidSegmentEntity segment = null;
		segment = service.searchPidSegment(uniqueId);
		
		//return ResponseEntity<>(HttpStatus.OK.body(segment));
		
		return ResponseEntity.status(HttpStatus.OK).body(segment);
		
			
				
	}
  
	@PostMapping("/save")
	ResponseEntity<Object> savePidSegment(@RequestBody PidSegmentEntity entity){
		PidSegmentEntity segment = null;
		segment = service.savePidsegment(entity);
		//return ResponseEntity<>(HttpStatus.OK.body(segment));
		
		return ResponseEntity.status(HttpStatus.OK).body(segment);
		
	}
	@PutMapping("/update")
	ResponseEntity<Object> updateData(@RequestBody PidSegmentEntity entity){
		return ResponseEntity.status(HttpStatus.OK).body(service.updateData(entity));
		
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable PidSegmentEntity entity) {
		service.deleteByUniqueId(entity);
	}
}

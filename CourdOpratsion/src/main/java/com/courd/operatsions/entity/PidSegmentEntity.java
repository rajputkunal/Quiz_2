package com.courd.operatsions.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="pidsegmente")

public class PidSegmentEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
    private String uniqueId;
	private String firstName;
	private String lastName;
	private String middleName;
	private String physicianName;
	private String dob;
	
	
	
	
	
	
	
	public PidSegmentEntity() {
		super();
	}


	public PidSegmentEntity(String uniqueId, String firstName, String lastName, String middleName, String physicianName,
			String dob) {
		super();
		this.uniqueId = uniqueId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.physicianName = physicianName;
		this.dob = dob;
	}


	public PidSegmentEntity(int id, String uniqueId, String firstName, String lastName, String middleName,
			String physicianName, String dob) {
		super();
		this.id = id;
		this.uniqueId = uniqueId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.physicianName = physicianName;
		this.dob = dob;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUniqueId() {
		return uniqueId;
	}


	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getPhysicianName() {
		return physicianName;
	}


	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

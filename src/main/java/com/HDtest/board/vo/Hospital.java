package com.HDtest.board.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="hospital")
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hospital_seq")
	@SequenceGenerator(sequenceName = "hospital_seq", name = "hospital_seq", allocationSize = 1)
	@Column(unique = true)
	private int hospitalId;
	@Column(length = 45, nullable = false)
	private String hosptalName;
	@Column(length = 20, nullable = false)
	private String nusinghomeId;
	@Column(length = 10, nullable = false)
	private String directorName;
	
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHosptalName() {
		return hosptalName;
	}
	public void setHosptalName(String hosptalName) {
		this.hosptalName = hosptalName;
	}
	public String getNusinghomeId() {
		return nusinghomeId;
	}
	public void setNusinghomeId(String nusinghomeId) {
		this.nusinghomeId = nusinghomeId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	
	

}

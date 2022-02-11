package com.HDtest.board.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "patient", uniqueConstraints = @UniqueConstraint(columnNames = {"patientId", "hospitalId"}))
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_seq")
	@SequenceGenerator(sequenceName = "patient_seq", name = "patient_seq", allocationSize = 1)
	private int patientId;
	@ManyToOne
	@JoinColumn(name = "hospitalId", nullable = false)
	private Hospital hospitalId;
	@Column(length = 45, nullable = false)
	private String patientName;
	@Column(length = 13, nullable = false)
	private String patientCode;
	@Column(length = 10, nullable = false)
	private String genderCode;
	@Column(length = 10)
	private String birth;
	@Column(length = 20)
	private String phone;
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public Hospital getHostpitalId() {
		return hospitalId;
	}
	public void setHostpitalId(Hospital hostpitalId) {
		this.hospitalId = hostpitalId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientCode() {
		return patientCode;
	}
	public void setPatientCode(String patientCode) {
		this.patientCode = patientCode;
	}
	public String getGenderCode() {
		return genderCode;
	}
	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}

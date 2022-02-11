package com.HDtest.board.vo;

import java.sql.Timestamp;

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

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "visit", uniqueConstraints = @UniqueConstraint(columnNames = {"visitId", "hospitalId", "patientId"}))
public class Visit {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "visit_seq")
	@SequenceGenerator(sequenceName = "visit_seq", name = "visit_seq", allocationSize = 1)
	private int visitId;
	@ManyToOne
	@JoinColumn(name = "hospitalId", nullable = false)
	private Hospital hospitalId;
	@ManyToOne
	@JoinColumn(name = "patientId", nullable = false)
	private Patient patientId;
	@CreationTimestamp
	@Column(nullable = false)
	private Timestamp vdate;
	@Column(length = 10 ,nullable = false)
	private String visitCode;
	
	public int getVisitId() {
		return visitId;
	}
	public void setVisitId(int visitId) {
		this.visitId = visitId;
	}
	public Hospital getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(Hospital hospitalId) {
		this.hospitalId = hospitalId;
	}
	public Patient getPatientId() {
		return patientId;
	}
	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}
	public Timestamp getVdate() {
		return vdate;
	}
	public void setVdate(Timestamp vdate) {
		this.vdate = vdate;
	}
	public String getVisitCode() {
		return visitCode;
	}
	public void setVisitCode(String visitCode) {
		this.visitCode = visitCode;
	}

	
}

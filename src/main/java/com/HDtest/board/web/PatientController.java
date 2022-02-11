package com.HDtest.board.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HDtest.board.dao.PatientRepository;
import com.HDtest.board.vo.Hospital;
import com.HDtest.board.vo.Patient;

@RestController
public class PatientController {
	
	@Autowired
	private PatientRepository patientRepository;

	@GetMapping(value = "/patient", produces = "application/json; charset=utf8")
	public Page<Patient> apiList(@PathVariable int n, Pageable pageable, Model m) {
		return patientRepository.findAll(pageable);
	}

	@GetMapping(value = "/patient/{patientId}", produces = "application/json; charset=utf8")
	public Optional<Patient> apiDetail(@PathVariable int patientId) {
		return patientRepository.findById(patientId);
	}
	
	@PutMapping(value = "/patient/{patientId}", produces = "application/json; charset=utf8")
	public Patient apiUpdate(@PathVariable int patientId, Patient p) {
		Optional<Patient> opPatient = patientRepository.findById(patientId);
		
		Patient patient = opPatient.get();
		patient.setPatientName(p.getPatientName());
		patient.setPatientCode(p.getPatientCode());
		patient.setBirth(p.getBirth());
		patient.setPhone(p.getPhone());
		return patientRepository.save(patient);
	}
	
	@DeleteMapping(value = "/patient/{patientId}")
	public ResponseEntity apiDelete(@PathVariable int patientId) {
		patientRepository.deleteById(patientId);
		return new ResponseEntity("삭제완료", HttpStatus.OK);
	}
	

	


}

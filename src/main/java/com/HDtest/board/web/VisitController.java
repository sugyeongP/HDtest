package com.HDtest.board.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HDtest.board.dao.VisitRepository;
import com.HDtest.board.vo.Visit;

@RestController
public class VisitController {
	
	@Autowired
	private VisitRepository visitRepository;
	
	@PostMapping(name = "/visit")
	public Visit createVisit(Visit v) {
		return visitRepository.save(v);
	}
	
	@GetMapping(name = "/visit", produces = "application/json; charset=utf8")
	public List<Visit> readVisit(Model m) {
		return visitRepository.findAll();	//목록으로 불러옴
	}
	
	@PutMapping(name = "/visit/{visitId}")
	public Visit updateVisit(@PathVariable int visitId, Visit v) {
		Optional<Visit> opVisit = visitRepository.findById(visitId);
		
		Visit visit = opVisit.get();
		visit.setHospitalId(v.getHospitalId());
		visit.setPatientId(v.getPatientId());
		visit.setVdate(v.getVdate());
		visit.setVisitCode(v.getVisitCode());
		return visitRepository.save(visit);
		
	}

	@DeleteMapping(name = "/visit/{visitId}")
	public ResponseEntity deleteVisit(@PathVariable int visitId) {
		visitRepository.deleteById(visitId);
		return new ResponseEntity("삭제완료", HttpStatus.OK);
	}


}

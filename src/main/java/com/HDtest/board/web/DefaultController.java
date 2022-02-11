package com.HDtest.board.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.HDtest.board.dao.PatientRepository;
import com.HDtest.board.vo.Hospital;
import com.HDtest.board.vo.Patient;

@Controller
public class DefaultController {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@RequestMapping(value = "/registration")
	public String regiForm() {
		return "hd/registration";
	}
	
	@PostMapping(value = "/registration")
	public String addPatient(Patient p) {
		Hospital hos = new Hospital();
		hos.setHospitalId(11); //병원ID지정
		p.setHostpitalId(hos);
		patientRepository.save(p);
		return "redirect:registration";
	}
	
	@RequestMapping(value = "detail/{patientId}")
	public String patientDetail(Model m, @PathVariable int patientId) {
		Optional<Patient> detail = patientRepository.findById(patientId);
		m.addAttribute("detail", detail.get());
		System.out.println(detail.get());
		return "hd/patientDetail";
	}
	
	
	@RequestMapping(value = "patientList")
	public String patientList(Model m) {
		List<Patient> list = patientRepository.findAll(); 
		m.addAttribute("list", list);
		
		//List<Patient> patient = patientRepository.findAll();
		int total = (int) list.size();
		m.addAttribute("total", total);
		return "hd/patientList";
	}
	

}

package com.HDtest.board.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.HDtest.board.vo.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{
	

}

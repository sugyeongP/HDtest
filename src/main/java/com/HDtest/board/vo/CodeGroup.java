package com.HDtest.board.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "codeGroup")
public class CodeGroup {
	@Id
	@Column(length = 10, nullable = false)
	private String codeG;
	@Column(length = 10, nullable = false)
	private String codeGName;
	@Column(length = 10, nullable = false)
	private String explanaiton;
	
	public String getCodeG() {
		return codeG;
	}
	public void setCodeG(String codeG) {
		this.codeG = codeG;
	}
	public String getCodeGName() {
		return codeGName;
	}
	public void setCodeGName(String codeGName) {
		this.codeGName = codeGName;
	}
	public String getExplanaiton() {
		return explanaiton;
	}
	public void setExplanaiton(String explanaiton) {
		this.explanaiton = explanaiton;
	}
	
	
}

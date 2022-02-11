package com.HDtest.board.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "code")
public class Code {
	@ManyToOne
	@JoinColumn(name="codeGroup_codeG",nullable = false)
	private CodeGroup codeG;
	@Id
	@Column(length = 10, nullable = false)
	private String code;
	@Column(length = 10, nullable = false)
	private String codeName;
	
	public CodeGroup getCodeG() {
		return codeG;
	}
	public void setCodeG(CodeGroup codeG) {
		this.codeG = codeG;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	
}

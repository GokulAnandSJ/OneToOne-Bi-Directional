package com.jsp.OneToOne_BI_Directional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	private int passportId;
	private String passportIssuedplace;
	private int passportNumber;

	//------------------------------------------
	@OneToOne(mappedBy = "pass")
	private Person per;
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}


	//	--------------------------------------

	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getPassportIssuedplace() {
		return passportIssuedplace;
	}
	public void setPassportIssuedplace(String passportIssuedplace) {
		this.passportIssuedplace = passportIssuedplace;
	}
	public int getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}



}

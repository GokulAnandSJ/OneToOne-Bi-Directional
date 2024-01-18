package com.jsp.OneToOne_BI_Directional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	private int personId;
	private String personName;
	private String personLocation;
	
	//--------------------------------------
	@OneToOne
	private Passport pass;
	public Passport getPass() {
		return pass;
	}
	public void setPass(Passport pass) {
		this.pass = pass;
	}
	//-----------------------------------------
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonLocation() {
		return personLocation;
	}
	public void setPersonLocation(String personLocation) {
		this.personLocation = personLocation;
	}

}

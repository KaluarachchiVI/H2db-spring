package com.victaz.sms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Staff {
	// auto generating id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stfId;
	@JsonProperty("fname")
	private String fname;
	 @JsonProperty("lname")
	private String lname;
	private int salary;

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(int stfId, String fname, String lname, int salary) {
		super();
		this.stfId = stfId;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}

	public int getStfId() {
		return stfId;
	}

	public void setStfId(int stfId) {
		this.stfId = stfId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

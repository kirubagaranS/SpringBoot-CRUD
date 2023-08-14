package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Detial")
public class Detial {
	@Id
	private String sno;
	private String firstname;
	private String lastname;
	private String gender;
	private String email;
	private String password;
	private String mobileno;
	private String age;
	private String dob;
	private String country;
	
	
	
	public Detial() {
		super();
	}
	public Detial(String sno, String firstname, String lastname, String gender, String email, String password,
			String mobileno, String age, String dob, String country) {
		super();
		this.sno = sno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.mobileno = mobileno;
		this.age = age;
		this.dob = dob;
		this.country = country;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}

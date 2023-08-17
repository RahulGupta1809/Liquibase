package com.liquibaseproject.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_liquibase")
public class Employee {

	@Id
	@Column(name = "EMPLOYEE_ID")
	private Long employeeId;

	@Column(name = "EMPLOYEE_NAME")
	private String name;
	@Column(name = "EMPLOYEE_EMAIL")
	private String email;
	@Column(name = "EMPLOYEE_DESIGNATION")
	private String designation;
	@Column(name = "EMPLOYEE_PHONE_NUMBER")
	private Long phoneNo;
	@Column(name = "EMPLOYEE_ADDRESS")
	private String address;

	public Employee(Long employeeId, String name, String email, String designation, Long phoneNo, String address) {

		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.designation = designation;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public Employee() {

	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Long getphoneNo() {
		return phoneNo;
	}

	public void setphoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

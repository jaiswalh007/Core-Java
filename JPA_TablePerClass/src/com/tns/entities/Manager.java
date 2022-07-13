package com.tns.entities;

import javax.persistence.*;

@Entity
@Table(name="mgr")
public class Manager extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
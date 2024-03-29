package com.ts.employee.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="EMPLOYEE_NAME")
	private String name;
	@Column(name="EMPLOYEE_SALARY")
	private Integer salary;
	private String depid;
	private String email;
	

}



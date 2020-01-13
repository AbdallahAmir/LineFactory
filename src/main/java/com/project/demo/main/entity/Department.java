package com.project.demo.main.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="department")
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="department_id")
	private int id;
	
	@Column(name="department_name")
	private String name;
	
	@Column(name="speciality")
	private String speciality;
	
	@ManyToOne
	@JoinColumn(name="factory_id")
	private Factory factory;
	
	/*
	 * @OneToMany
	 * 
	 * @JoinColumn(name="department_id")
	 * 
	 * @JsonIgnore private List<Employee> employees;
	 */

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public Department() {
		
	}
	

	

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

	public Department(String name, String speciality, Factory factor/* , List<Employee> employees */) {
		this.name = name;
		this.speciality = speciality;
		this.factory = factor;
		//this.employees = employees;
	}

	/*
	 * public void add(Employee employee) { if(employees == null) { employees = new
	 * ArrayList<>(); }
	 * 
	 * employees.add(employee); }
	 */
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", speciality=" + speciality + "]";
	}
	


}

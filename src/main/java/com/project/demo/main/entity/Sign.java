package com.project.demo.main.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sign")
public class Sign {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sign_id")
	private int id;
	
	@Column(name="sign_in")
	private Date sign_in;
	
	@Column(name="sign_out")
	private Date sign_out;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="employee_id")
	private Employee employee;

	public Sign() {}
	
	public Sign(Date sign_in, Date sign_out) {
		super();
		this.sign_in = sign_in;
		this.sign_out = sign_out;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getSign_in() {
		return sign_in;
	}

	public void setSign_in(Date sign_in) {
		this.sign_in = sign_in;
	}

	public Date getSign_out() {
		return sign_out;
	}

	public void setSign_out(Date sign_out) {
		this.sign_out = sign_out;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	
}

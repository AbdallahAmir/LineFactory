package com.project.demo.main.entity;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shift")
public class Shift implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="shift_id")
	private int shift_id;
	
	@Column(name="shift_from")
	private int shift_from;
	
	@Column(name="shift_to")
	private int shift_to;
	
	@Column(name="working_days")
	private int working_days;

	
	public int getShift_id() {
		return shift_id;
	}

	public void setShift_id(int id) {
		this.shift_id = id;
	}

	public int getShift_from() {
		return shift_from;
	}

	public void setShift_from(int from) {
		this.shift_from = from;
	}

	public int getShift_to() {
		return shift_to;
	}

	public void setShift_to(int to) {
		this.shift_to = to;
	}

	public int getWorking_days() {
		return working_days;
	}

	public void setWorking_days(int workingDays) {
		this.working_days = workingDays;
	}

	public Shift() {
		 
	}

	public Shift(int from, int to, int workingDays) {
		this.shift_from = from;
		this.shift_to = to;
		this.working_days = workingDays;
	}

	@Override
	public String toString() {
		return "Shift [shift_id=" + shift_id + ", shift_from=" + shift_from + ", shift_to=" + shift_to + ", daysNumber=" + working_days + "]";
	}
	

}

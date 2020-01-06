package com.project.demo.main.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shift")
public class Shift {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="shift_id")
	private int id;
	
	@Column(name="from")
	private int from;
	
	@Column(name="to")
	private int to;
	
	@Column(name="working_days")
	private int workingDays;

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	public Shift() {
		 
	}

	public Shift(int from, int to, int workingDays) {
		this.from = from;
		this.to = to;
		this.workingDays = workingDays;
	}

	@Override
	public String toString() {
		return "Shift [id=" + id + ", from=" + from + ", to=" + to + ", daysNumber=" + workingDays + "]";
	}
	

}

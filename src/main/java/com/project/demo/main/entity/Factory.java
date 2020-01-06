package com.project.demo.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="factory")
public class Factory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="factory_id")
	private int id;
	
	@Column(name="factory_name")
	private String name;
	
	@Column(name="buildings")
	private int buildings;
	
	@Column(name="floors")
	private int floors;
	
	@Column(name="industry")
	private String industry;
	
	@Column(name="location")
	private String location;
	
	@Column(name="ownername")
	private String ownerName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBuildings() {
		return buildings;
	}

	public void setBuildings(int buildings) {
		this.buildings = buildings;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Factory() {
		
	}

	public Factory(String name, int buildings, int floors, String industry, String location, String ownerName) {
		this.name = name;
		this.buildings = buildings;
		this.floors = floors;
		this.industry = industry;
		this.location = location;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Factory [id=" + id + ", name=" + name + ", buildings=" + buildings + ", floors=" + floors
				+ ", industries=" + industry + ", location=" + location + ", ownerName=" + ownerName + "]";
	}
	
	
	

}

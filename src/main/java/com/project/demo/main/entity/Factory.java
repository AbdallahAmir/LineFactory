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
	private String factory_name;
	
	@Column(name="buildings")
	private int buildings;
	
	@Column(name="floors")
	private int floors;
	
	@Column(name="industry")
	private String industry;
	
	@Column(name="location")
	private String location;
	
	@Column(name="owenrname")
	private String owenrname;



	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFactory_name() {
		return factory_name;
	}

	public void setFactory_name(String name) {
		this.factory_name = name;
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
		return owenrname;
	}

	public void setOwnerName(String owenrname) {
		this.owenrname = owenrname;
	}
	

	public Factory() {
		
	}

	public Factory(String name, int buildings, int floors, String industry, String location, String owenrname) {
		this.factory_name = name;
		this.buildings = buildings;
		this.floors = floors;
		this.industry = industry;
		this.location = location;
		this.owenrname = owenrname;
	}

	@Override
	public String toString() {
		return "Factory [id=" + id + ", factory_name=" + factory_name + ", buildings=" + buildings + ", floors=" + floors
				+ ", industries=" + industry + ", location=" + location + ", ownerName=" + owenrname + "]";
	}
	
	
	

}

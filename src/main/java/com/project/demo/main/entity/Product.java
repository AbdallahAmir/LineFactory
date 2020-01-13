package com.project.demo.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	
	@Column(name="product_name")
	private String name;
	
	@Column(name="product_type")
	private String type;
	
	@Column(name="target")
	private int target;
	
	

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}
	


	public Product() {
		
	}

   
	public Product(int id, String name, String type, int target) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.target = target;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", target=" + target + "]";
	}
	
	

}

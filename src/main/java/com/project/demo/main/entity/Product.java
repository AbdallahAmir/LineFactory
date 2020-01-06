package com.project.demo.main.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	  @ManyToMany(fetch=FetchType.LAZY,cascade=
	  {CascadeType.DETACH,CascadeType.MERGE ,CascadeType.PERSIST,
	  CascadeType.REFRESH})
	  
	  @JoinTable(name="product_emp", joinColumns= @JoinColumn(name="product_id"),
	  inverseJoinColumns = @JoinColumn(name="employee_id")) 
	  @JsonIgnore
	  private List <Employee> employees;
	 
	

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

	public Product(String name, String type, int target) {
		
		this.name = name;
		this.type = type;
		this.target = target;
	}
	

	
	  public List<Employee> getEmployees() { return employees; }
	  
	  public void setEmployees(List<Employee> employees) { this.employees =
	  employees; }
	 

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", target=" + target + "]";
	}
	
	

}

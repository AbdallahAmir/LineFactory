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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int id;
	
	@Column(name="employee_name")
	private String employee_name;
	
	@Column(name="employee_address")
	private String employee_address;
	
	@Column(name="contacts")
	private String contacts;
	 
	@Column(name="salary")
	private double salary;
	
	@Lob
	@Column(name="image")
	private byte[] image;
	
	@Column(name="password")
	private String password;
	

	@Column(name="employee_email")
	private String employee_email;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.DETACH,CascadeType.MERGE
			,CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="department_id")
	private Department department;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE
			,CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="shift_id")
	private Shift shift;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE
			,CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="product_id")
	private Product product;
	
	 @OneToMany(mappedBy = "employee")
		@JsonIgnore

	 private List<Sign> signs;
	
	
	  public List<Sign> getSigns() {
		return signs;
	}

	public void setSigns(List<Sign> signs) {
		this.signs = signs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String name) {
		this.employee_name = name;
	}

	public String getEmployee_address() {
		return employee_address;
	}

	public void setEmployee_address(String adress) {
		this.employee_address = adress;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public double getSalary() {
		return salary;
	}
	

	public Product getProduct() {
		return product;
	}




	public void setProduct(Product product) {
		this.product = product;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}
	public byte[] getImage() {
		
		return image;
	}
	  
	  public void setImage(byte[] image) { this.image = image; }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployee_email() {
		return employee_email;
	}

	public void setEmployee_email(String email) {
		this.employee_email = email;
	}


	public Shift getShift() {
		return shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}
	

	@JsonIgnore
	public Department getDepartment() {
		return department;
	}
	@JsonProperty
	public void setDepartment(Department department) {
		this.department = department;
	}
	


	public Employee() {
		
	}

	public Employee(int id, String employee_name, String employee_address, String contacts, double salary, byte[] image,
			String password, String employee_email, Department department, Shift shift, Product product,
			List<Sign> signs) {
		
		this.id = id;
		this.employee_name = employee_name;
		this.employee_address = employee_address;
		this.contacts = contacts;
		this.salary = salary;
		this.image = image;
		this.password = password;
		this.employee_email = employee_email;
		this.department = department;
		this.shift = shift;
		this.product = product;
		this.signs = signs;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", employee_name=" + employee_name + ", adress=" + employee_address + ", contacts=" + contacts + ", salary="
				+ salary + ", password=" + password + ", employee_email=" + employee_email + "]";
	}
		

}

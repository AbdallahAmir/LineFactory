package com.project.demo.main.entity;

import java.util.ArrayList;
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
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int id;
	
	@Column(name="employee_name")
	private String name;
	
	@Column(name="employee_address")
	private String address;
	
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
	private String email;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE
			,CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="department_id")
	private Department department;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE
			,CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="shift_id")
	private Shift shift;
	
	  @ManyToMany(fetch=FetchType.LAZY,cascade=
	  {CascadeType.DETACH,CascadeType.MERGE ,CascadeType.PERSIST,
	  CascadeType.REFRESH})
	  @JoinTable(name="product_emp", joinColumns=
	  {@JoinColumn(name="employee_id")}, inverseJoinColumns =
	  {@JoinColumn(name="product_id")}) 
	  private List <Product> products;
	 
	  @Column(name="priority")
	  private int priority;
	
	
	  public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Shift getShift() {
		return shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}
	

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
	  public List<Product> getProducts()
	  {
		  return products;
		  }
	  
	  public void setProducts(List<Product> products)
	  {
		  this.products = products;
	  }
	   
	  public Employee() { }
	  
	  
	
	public Employee(String name, String address, String contacts, double salary, byte[] image, String password,
			String email, Department department, Shift shift, List<Product> products, int priority) {
		this.name = name;
		this.address = address;
		this.contacts = contacts;
		this.salary = salary;
		this.image = image;
		this.password = password;
		this.email = email;
		this.department = department;
		this.shift = shift;
		this.products = products;
		this.priority = priority;
	}

	public void add(Product product) {
		if(products == null) {
			products = new ArrayList<>();
		}
		
		products.add(product);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adress=" + address + ", contacts=" + contacts + ", salary="
				+ salary + ", password=" + password + ", email=" + email + "]";
	}
		

}

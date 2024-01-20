package model.entities;

import java.util.Date;

public class Seller {
	private Integer id;
	private String name;
	private String email;
	private Date birthDate;
	private Department department;
	
	public Seller() {}
	public Seller(Integer id, String name, String email, Date birthDate, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.department = department;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Department getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", department="
				+ department + "]";
	}
	
	
}
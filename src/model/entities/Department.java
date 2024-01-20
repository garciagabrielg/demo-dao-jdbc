package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer Id;
	
	public Department() {
	}
	public Department (String name, Integer id) {
		this.name = name;
		this.Id = id;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return Id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId (Integer id) {
		this.Id = id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(Id, other.Id);
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", Id=" + Id + "]";
	}
}

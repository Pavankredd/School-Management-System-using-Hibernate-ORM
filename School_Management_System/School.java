package School_Management_System;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class School 
{
	@Id
	private int sc_id;
	private String sc_name;
	private String sc_address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "principal_id")
	private Principal principal;

	@OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
	private List<Teachers> teachers;

	@OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
	private List<Students> students;

	public int getSc_id() {
		return sc_id;
	}

	public void setSc_id(int sc_id) {
		this.sc_id = sc_id;
	}

	public String getSc_name() {
		return sc_name;
	}

	public void setSc_name(String sc_name) {
		this.sc_name = sc_name;
	}

	public String getSc_address() {
		return sc_address;
	}

	public void setSc_address(String sc_address) {
		this.sc_address = sc_address;
	}

	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public List<Teachers> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teachers> teachers) {
		this.teachers = teachers;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}
	
	
}

package org.deserialization;

import java.util.ArrayList;

public class RootClass {

	private int id;
	private String name;
	private long mobile;
	private Employee employee;
	private ArrayList<String> course;

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

	public long getNo() {
		return mobile;
	}

	public void setNo(long no) {
		this.mobile = no;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public ArrayList<String> getCourse() {
		return course;
	}

	public void setCourse(ArrayList<String> course) {
		this.course = course;
	}

}

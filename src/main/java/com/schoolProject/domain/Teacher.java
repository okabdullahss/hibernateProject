package com.schoolProject.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.schoolProject.enums.CourseEnums;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String surName;
	 
	@OneToMany(mappedBy="teacher")
	private List<Course> courseList = new ArrayList<>();
	
	@OneToOne(mappedBy="teacher")
	private Adress adress;
	
	@Enumerated(EnumType.STRING)
	private CourseEnums branch;

	public CourseEnums getBranch() {
		return branch;
	}

	public void setBranch(CourseEnums branch) {
		this.branch = branch;
	}

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

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", surName=" + surName + ", branch=" + branch + "]";
	}

 
	
	
}

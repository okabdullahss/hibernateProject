package com.schoolProject.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.schoolProject.enums.ClassNumberEnums;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String surName;
	
	@Enumerated(EnumType.STRING)
	private ClassNumberEnums classNumber;
	
	private int age;
	
	@OneToOne(mappedBy="student", cascade = CascadeType.ALL)
	private Adress adress;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Student_Course",	
	joinColumns = {@JoinColumn(name="std_id")},
	inverseJoinColumns = {@JoinColumn(name="course_id")})	
	private List<Course> courseList = new ArrayList<>();

	
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
	
	

	public ClassNumberEnums getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(ClassNumberEnums classNumber) {
		this.classNumber = classNumber;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surName=" + surName + ", classNumber=" + classNumber
				+ ", age=" + age + ", adress=" + adress + "]";
	}

	 
	
	
	
	
	
	
}

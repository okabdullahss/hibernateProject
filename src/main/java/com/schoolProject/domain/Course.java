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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;

import com.schoolProject.enums.CourseEnums;
import com.schoolProject.enums.LocationEnums;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Enumerated(EnumType.STRING)
	private CourseEnums courseName;
	
	@Enumerated(EnumType.STRING)
	private LocationEnums location;
	
	
	
	@ManyToMany(mappedBy="courseList")
	private List<Student> studentList = new ArrayList<>();
	
	
	
	@JoinColumn(name="teacher_id")
	@ManyToOne(cascade= CascadeType.ALL)
	private Teacher teacher;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public CourseEnums getCourseName() {
		return courseName;
	}

	public void setCourseName(CourseEnums courseName) {
		this.courseName = courseName;
	}

	public LocationEnums getLocation() {
		return location;
	}

	public void setLocation(LocationEnums location) {
		this.location = location;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", location=" + location +  ", teacher=" + teacher +"]";
	}

	 
	
	
	
}

package com.schoolProject.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.schoolProject.enums.CityEnums;

@Entity
public class Adress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String adress;
	
	@Enumerated(EnumType.STRING)
	private CityEnums city;
	
	@OneToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	@OneToOne
	@JoinColumn(name="teacher_id")
	private Teacher teacher;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	 

	public CityEnums getCity() {
		return city;
	}

	public void setCity(CityEnums city) {
		this.city = city;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Adress [id=" + id + ", adress=" + adress + ", city=" + city + ", teacher="
				+ teacher + "]";
	}

	 

	 
	
	
	
	
}

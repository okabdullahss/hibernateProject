package com.schoolProject.service;

import com.schoolProject.domain.Student;

public interface IStudentService {

	public void saveStudent(Student student);
	public Student getStudent(Integer id);
	public void removeStudent(Student student);
 
}

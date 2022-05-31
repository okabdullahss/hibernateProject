package com.schoolProject.service;

import com.schoolProject.domain.Student;
import com.schoolProject.repository.StudentRepository;

public class StudentServiceImpl implements IStudentService {

	StudentRepository studentRepo = new StudentRepository();
	@Override
	public void saveStudent(Student student) {
		studentRepo.saveStudent(student);
		
	}

	@Override
	public Student getStudent(Integer id) {
		return studentRepo.getStudent(id);
	}

	@Override
	public void removeStudent(Student student) {
		studentRepo.removeStudent(student);
		
	}

}

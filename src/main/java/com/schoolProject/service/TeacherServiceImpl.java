package com.schoolProject.service;

import com.schoolProject.domain.Teacher;
import com.schoolProject.repository.TeacherRepository;

public class TeacherServiceImpl implements ITeacherService {

	TeacherRepository teacherRepo = new TeacherRepository();
	
	@Override
	public void saveTeacher(Teacher teacher) {
	teacherRepo.saveTeacher(teacher);
		
	}

	@Override
	public Teacher getTeacher(Integer id) {
		return teacherRepo.getTeacher(id);
	}

	@Override
	public void removeTeacher(Teacher teacher) {
		teacherRepo.removeTeacher(teacher);
		
	}

}

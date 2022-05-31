package com.schoolProject.service;

import com.schoolProject.domain.Teacher;

public interface ITeacherService {

	public void saveTeacher(Teacher teacher);
	public Teacher getTeacher(Integer id);
	public void removeTeacher(Teacher teacher);

}

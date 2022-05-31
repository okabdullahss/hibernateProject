package com.schoolProject.service;

import com.schoolProject.domain.Course;

public interface ICourseService {

	public void saveCourse(Course course);
	public Course getCourse(Integer id);
	public void removeCourse(Course course);
	
	
}

package com.schoolProject.service;

import com.schoolProject.domain.Course;
import com.schoolProject.repository.CourseRepository;

public class CourseServiceImpl implements ICourseService{

	CourseRepository courseRepo = new CourseRepository();
	@Override
	public void saveCourse(Course course) {
		courseRepo.saveCourse(course);
		
	}

	@Override
	public Course getCourse(Integer id) {
		return courseRepo.getCourse(id);
	}

	@Override
	public void removeCourse(Course course) {
		courseRepo.removeCourse(course);
		
	}

}

package com.schoolProject.main;

import com.schoolProject.domain.Adress;
import com.schoolProject.domain.Course;
import com.schoolProject.domain.Student;
import com.schoolProject.domain.Teacher;
import com.schoolProject.enums.CityEnums;
import com.schoolProject.enums.ClassNumberEnums;
import com.schoolProject.enums.CourseEnums;
import com.schoolProject.enums.LocationEnums;
import com.schoolProject.service.AdressServiceImp;
import com.schoolProject.service.CourseServiceImpl;
import com.schoolProject.service.IAdressService;
import com.schoolProject.service.ICourseService;
import com.schoolProject.service.IStudentService;
import com.schoolProject.service.ITeacherService;
import com.schoolProject.service.StudentServiceImpl;
import com.schoolProject.service.TeacherServiceImpl;

public class Client {

	public static void main(String[] args) {

		
		IAdressService adressService = new AdressServiceImp();
		ICourseService courseService = new CourseServiceImpl();
		IStudentService studentService = new StudentServiceImpl();
		ITeacherService teacherService = new TeacherServiceImpl();
		
		Adress adres1 = new Adress();
		Adress adres2 = new Adress();
		
		Teacher teacher1 = new Teacher();
		Teacher teacher2 = new Teacher();
		
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		
//		Student student1 = new Student();
//		Student student2 = new Student();
//		Student student3 = new Student();
//		
//		adres1.setAdress("Yorkshire Berkeley");
//		adres1.setCity(CityEnums.CALIFORNIA);
//		adres1.setStudent(student1);
//		adres1.setTeacher(teacher1);
//		
//		adres2.setAdress("Red Boluevard");
//		adres2.setCity(CityEnums.PRAGUE);
//		adres2.setStudent(student2);
//		adres2.setTeacher(teacher2);
//		
//		teacher1.setName("Walter H.");
//		teacher1.setSurName("White");
//		teacher1.setAdress(adres1);
//		teacher1.getCourseList().add(course2);
//		teacher1.getCourseList().add(course1);
//		teacher1.setBranch(CourseEnums.ECONOMY);
//		
//		teacher2.setName("Theodore");
//		teacher2.setSurName("Bagwell");
//		teacher2.setAdress(adres2);
//		teacher2.getCourseList().add(course2);
//		teacher2.getCourseList().add(course1);
//		teacher2.setBranch(CourseEnums.MATHEMATICS);
//		
//		course1.setCourseName(CourseEnums.ALGEBRA);
//		course1.setLocation(LocationEnums.HOME);
//		course1.setTeacher(teacher2);
//		course1.getStudentList().add(student2);
//		course1.getStudentList().add(student1);
//		
//		course2.setCourseName(CourseEnums.BIOLOGY);
//		course2.setLocation(LocationEnums.PREPSCHOOL);
//		course2.setTeacher(teacher1);
//		course2.getStudentList().add(student2);
//		course2.getStudentList().add(student1);
//		
//		course3.setCourseName(CourseEnums.HISTORY);
//		course3.setLocation(LocationEnums.SCHOOL);
//		course3.setTeacher(teacher1);
//		course3.getStudentList().add(student2);
//		course3.getStudentList().add(student1);
//		course3.getStudentList().add(student3);
//		
//		
//		student1.setName("Boris");
//		student1.setSurName("Yeltsin");
//		student1.setClassNumber(ClassNumberEnums.A);
//		student1.setAge(55);
//		student1.setAdress(adres1);
//		student1.getCourseList().add(course2);
//		student1.getCourseList().add(course1);
//		
//		student2.setName("Cahar");
//		student2.setSurName("Dudayev");
//		student2.setClassNumber(ClassNumberEnums.B);
//		student2.setAge(45);
//		student2.setAdress(adres2);
//		student2.getCourseList().add(course2);
//		student2.getCourseList().add(course1);
//		
//		student3.setName("Dimitri");
//		student3.setSurName("Medmedev");
//		student3.setClassNumber(ClassNumberEnums.D);
//		student3.setAge(50);
//		student3.setAdress(adres2);
//		student3.getCourseList().add(course2);
//		student3.getCourseList().add(course1);
//		student3.getCourseList().add(course3);
		
		
//		studentService.saveStudent(student1);
//		studentService.saveStudent(student2);
//		studentService.saveStudent(student3);
		
//		adressService.saveAdress(adres2);
//		adressService.saveAdress(adres1);		
//		courseService.saveCourse(course2);
//		courseService.saveCourse(course1);		
//		teacherService.saveTeacher(teacher2);
//		teacherService.saveTeacher(teacher1);
		
		
//		Student student = studentService.getStudent(1);
//		System.out.println(student);
		
//		Student student = studentService.getStudent(1);
//		System.out.println(student);
		
		

		course2 = courseService.getCourse(2);
		courseService.removeCourse(course2); 
		//Exception in thread "main" javax.persistence.EntityExistsException:
		//A different object with the same identifier value was already associated with the  
		//session: [com.schoolProject.domain.Teacher#2]
		
		
		 
		
		
		
		

	}

}

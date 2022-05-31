package com.schoolProject.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.schoolProject.domain.Course;
import com.schoolProject.domain.Student;
import com.schoolProject.util.HibernateUtil;

public class StudentRepository {
	public void saveStudent(Student student) {
		SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
	}
	
	
	public Student getStudent(Integer id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student  foundStudent = session.get(Student.class, id);
		tx.commit();
		session.close();
		return foundStudent;
		
		
	}
	
	public void removeStudent(Student student) {
		SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.remove(student);
		
		tx.commit();
		session.close();
		
	}
}

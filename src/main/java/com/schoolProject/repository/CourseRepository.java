package com.schoolProject.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.schoolProject.domain.Adress;
import com.schoolProject.domain.Course;
import com.schoolProject.util.HibernateUtil;

public class CourseRepository {
	public void saveCourse(Course course) {
		SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(course);
		tx.commit();
		session.close();
	}
	
	
	public Course getCourse(Integer id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Course  foundCourse = session.get(Course.class, id);
		tx.commit();
		session.close();
		return foundCourse;
		
		
	}
	
	public void removeCourse(Course course) {
		SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.remove(course);
		
		tx.commit();
		session.close();
		
	}
}

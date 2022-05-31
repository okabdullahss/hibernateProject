package com.schoolProject.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.schoolProject.domain.Student;
import com.schoolProject.domain.Teacher;
import com.schoolProject.util.HibernateUtil;

public class TeacherRepository {
	public void saveTeacher(Teacher teacher) {
		SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(teacher);
		tx.commit();
		session.close();
	}
	
	
	public Teacher getTeacher(Integer id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Teacher  foundTeacher = session.get(Teacher.class, id);
		tx.commit();
		session.close();
		return foundTeacher;
		
		
	}
	
	public void removeTeacher(Teacher teacher) {
		SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.remove(teacher);
		
		tx.commit();
		session.close();
		
	}

}

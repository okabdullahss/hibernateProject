package com.schoolProject.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.schoolProject.domain.Adress;
import com.schoolProject.util.HibernateUtil;

public class AdressRepository {
	
	public void saveAdress(Adress adress) {
		SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(adress);
		tx.commit();
		session.close();
	}
	
	
	public Adress getAdress(Integer id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Adress foundAdress = session.get(Adress.class, id);
		tx.commit();
		session.close();
		return foundAdress;
		
		
	}
	
	public void removeAdress(Adress adress) {
		SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.remove(adress);
		
		tx.commit();
		session.close();
		
	}

}

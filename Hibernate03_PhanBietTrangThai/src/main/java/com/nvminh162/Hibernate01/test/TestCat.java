package com.nvminh162.Hibernate01.test;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nvminh162.Hibernate01.dao.CatDAO;
import com.nvminh162.Hibernate01.model.Cat;
import com.nvminh162.Hibernate01.util.HibernateUtil;

public class TestCat {
	public static void main(String[] args) {
		/**
		 * //transient Cat cat_1 = new Cat(); cat_1.setId(1); Cat cat = new Cat(); try {
		 * SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); if
		 * (sessionFactory != null) { Session session = sessionFactory.openSession();
		 * Transaction tr = session.beginTransaction();
		 * 
		 * //persistent cat = session.get(Cat.class, cat_1.getId()); //find() //load()
		 * 
		 * //detached tr.commit(); session.close(); } } catch (Exception e) {
		 * e.printStackTrace(); } //transient System.out.println(cat);
		 **/

//		CatDAO catDAO = new CatDAO();
//		Cat cat_1 = new Cat();
//		cat_1.setId(2);
//		Cat result = catDAO.selectById(cat_1);
//		System.out.println(result);

		// transient
		Cat cat_1 = new Cat("Meo long xu", new Date(System.currentTimeMillis()), true);
		
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();

				// persistent
				session.save(cat_1);

				// detached
				tr.commit();
				//detached => persistent
				session.refresh(cat_1);
				session.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// transient
		System.out.println(cat_1);

	}
}

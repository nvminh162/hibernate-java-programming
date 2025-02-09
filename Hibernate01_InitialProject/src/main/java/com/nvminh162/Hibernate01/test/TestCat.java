package com.nvminh162.Hibernate01.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nvminh162.Hibernate01.model.Cat;
import com.nvminh162.Hibernate01.util.HibernateUtil;

public class TestCat {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				try {
					Transaction tr = session.beginTransaction();
					Cat cat1 = new Cat();
					cat1.setName("Tom");
					cat1.setSex(true);
//					session.save(cat1);
					session.persist(cat1);
					tr.commit();
				} finally {
					session.close();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

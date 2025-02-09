package com.nvminh162.Hibernate01.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nvminh162.Hibernate01.dao.PersonDAO;
import com.nvminh162.Hibernate01.model.Person;
import com.nvminh162.Hibernate01.util.HibernateUtil;

public class Test2 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();

			String hql = "SELECT p.name, p.spouse.name FROM Person p";
			List<Object[]> results = session.createQuery(hql).list();
			
			for (Object[] rs : results) {
				String name = rs[0]+"";
				String spouseName = rs[1]+"";
				
				System.out.println(name + "- Đã kết hôn với -" + spouseName);
			}
			
			tr.commit();
			session.close();
		}
	}
}

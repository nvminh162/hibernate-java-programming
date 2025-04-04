package com.nvminh162.Hibernate01.test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nvminh162.Hibernate01.model.Student;
import com.nvminh162.Hibernate01.model.Teacher;
import com.nvminh162.Hibernate01.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();

			Teacher t1 = new Teacher("GV01", "Văn", new Date(System.currentTimeMillis()), "Hibernate");
			Student s1 = new Student("SV01", "Hoan", new Date(System.currentTimeMillis()), 7.5);

			session.save(t1);
			session.save(s1);

			tr.commit();
			session.close();
		}
	}
}

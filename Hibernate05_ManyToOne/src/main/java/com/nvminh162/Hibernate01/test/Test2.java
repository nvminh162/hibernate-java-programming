package com.nvminh162.Hibernate01.test;


import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nvminh162.Hibernate01.model.Author;
import com.nvminh162.Hibernate01.model.Book;
import com.nvminh162.Hibernate01.util.HibernateUtil;

public class Test2 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			/**
			Author a1 = new Author("A01", "Nguyen Nhat Anh", new Date(System.currentTimeMillis()));
			Book b1 = new Book("B01", "Sách 1", 50000, a1);
			Book b2 = new Book("B02", "Sách 2", 60000, a1);
			Book b3 = new Book("B03", "Sách 3", 70000, a1);
			
			session.saveOrUpdate(a1);
			session.saveOrUpdate(b1);
			session.saveOrUpdate(b2);
			session.saveOrUpdate(b3);
			**/
			
			/**
			Author a2 = new Author("A02", "Nguyen Van Minh", new Date(System.currentTimeMillis()));
			Book b4 = new Book("B04", "Sách 4", 80000, a2);
			Book b5 = new Book("B05", "Sách 5", 90000, a2);
			Book b6 = new Book("B06", "Sách 6", 100000, a2);
			
			session.saveOrUpdate(a2);
			session.saveOrUpdate(b4);
			session.saveOrUpdate(b5);
			session.saveOrUpdate(b6);
			tr.commit();
			session.close();
			**/
			
			Book b1 = session.find(Book.class, "B01");
			System.out.println(b1.getTitle());
		}
	}
}

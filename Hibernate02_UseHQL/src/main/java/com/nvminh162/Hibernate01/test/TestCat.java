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
		CatDAO catDAO = new CatDAO();
//		Select All
//		List<Cat> l = catDAO.selectAll();
//		for (Cat cat : l) {
//			System.out.println(cat);
//		}
		
//		Select id
//		Cat c = new Cat();
//		c.setId(1);
//		Cat c1 = catDAO.selectById(c);
//		System.out.println(c1);
		
		//insert
//		Cat c3 = new Cat("Văn 2", new Date(System.currentTimeMillis()), true);
//		catDAO.insert(c3);
		
		//update
//		Cat c3 = new Cat("Văn 2222", new Date(System.currentTimeMillis()), true);
//		c3.setId(5);
//		catDAO.update(c3);
		
		//delete
		Cat c3 = new Cat("Văn 2222", new Date(System.currentTimeMillis()), true);
		c3.setId(5);
		catDAO.delete(c3);
		
	}
}

package com.nvminh162.Hibernate01.test;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nvminh162.Hibernate01.model.Customer;
import com.nvminh162.Hibernate01.model.MyOrder;
import com.nvminh162.Hibernate01.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
//			/**
			Customer c1 = new Customer("001", "Minh", "minh@email.com");
			MyOrder o1 = new MyOrder("01", "HCM", c1);
			MyOrder o2 = new MyOrder("02", "HCM", c1);
			MyOrder o3 = new MyOrder("03", "HCM", c1);
			MyOrder o4 = new MyOrder("04", "HCM", c1);
			
			List<MyOrder> list = new ArrayList<MyOrder>();
			list.add(o1);
			list.add(o2);
			list.add(o3);
			list.add(o4);
			
			c1.setOrders(list);
			
			session.saveOrUpdate(c1);
			session.saveOrUpdate(o1);
			session.saveOrUpdate(o2);
			session.saveOrUpdate(o3);
			session.saveOrUpdate(o4);
			
			Customer c2 = new Customer("002", "Minh2", "minh2@email.com");
			session.saveOrUpdate(c2);
//			**/
			
			String hql = "FROM Customer c WHERE size(c.orders) > 0";
			List<Customer> results = session.createQuery(hql).list();
			
			for (Customer rs : results) {
				System.out.println("Khách hàng và số lượng đơn: "+ rs);
			}
			
			tr.commit();
			session.close();
		}
	}
}

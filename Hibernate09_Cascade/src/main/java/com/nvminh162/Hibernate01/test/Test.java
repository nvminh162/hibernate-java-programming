package com.nvminh162.Hibernate01.test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nvminh162.Hibernate01.model.ChiTietDonHang;
import com.nvminh162.Hibernate01.model.DonHang;
import com.nvminh162.Hibernate01.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();

			/*
			 * DonHang dh1 = new DonHang("Nguyen Van Minh", new
			 * Date(System.currentTimeMillis()));
			 * 
			 * ChiTietDonHang ctdh1 = new ChiTietDonHang("Mì Samyang", 5, 20000, 100000,
			 * dh1); ChiTietDonHang ctdh2 = new ChiTietDonHang("Mì HaoHao", 2, 10000, 20000,
			 * dh1);
			 * 
			 * dh1.addCTDT(ctdh1); dh1.addCTDT(ctdh2);
			 * 
			 * session.save(dh1);
			 */
			
			/*
			 * DonHang dh1 = session.load(DonHang.class, 1); session.remove(dh1);
			 */
			
			
			
			tr.commit();
			session.close();
		}
	}
}

package com.nvminh162.Hibernate01.test;

import java.sql.Date;
import java.util.Iterator;

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

//			DonHang dh1 = new DonHang("Nguyen Van Minh", new Date(System.currentTimeMillis()));
//
//			for (int i = 0; i < 10000; i++) {
//				ChiTietDonHang ctdh1 = new ChiTietDonHang("Mì random: "+Math.floor(Math.random()*1000000), i+1, i+100, i+1000, dh1);
//				dh1.addCTDT(ctdh1);
//			}
//
//			session.save(dh1);
			
			long batDau = System.currentTimeMillis();
			DonHang donHang = session.load(DonHang.class, 1);
			long ketThuc = System.currentTimeMillis();
			System.out.println(donHang.toString());
			System.out.println("Thời gian: "+(ketThuc - batDau));

			tr.commit();
			session.close();
		}
	}
}

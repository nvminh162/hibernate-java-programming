package com.nvminh162.Hibernate01.test;


import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nvminh162.Hibernate01.model.CuocHop;
import com.nvminh162.Hibernate01.model.NhanVien;
import com.nvminh162.Hibernate01.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			NhanVien nv1 = new NhanVien("001", "Nguyen Van A", new Date(System.currentTimeMillis()));
//			session.save(nv1);
			CuocHop ch1 = new CuocHop("HĐQT", "TPHCM", new Date(System.currentTimeMillis()));
			ch1.addNV(nv1);
			session.save(ch1);
				
			tr.commit();
			session.close();
		}
	}
}

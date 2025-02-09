package com.nvminh162.Hibernate01.model;

import java.sql.Date;

import jakarta.persistence.Entity;

@Entity
public class Student  extends Person{
	private double pointAvg;
	
	public Student() {
	}

	public Student(String id, String name, Date birth, double pointAvg) {
		super(id, name, birth);
		this.pointAvg = pointAvg;
	}

	public double getPointAvg() {
		return pointAvg;
	}

	public void setPointAvg(double pointAvg) {
		this.pointAvg = pointAvg;
	}
	
	
}

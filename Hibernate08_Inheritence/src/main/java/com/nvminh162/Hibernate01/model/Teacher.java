package com.nvminh162.Hibernate01.model;

import java.sql.Date;

import jakarta.persistence.Entity;

@Entity
public class Teacher extends Person {
	private String subjectName;

	public Teacher() {
	}

	public Teacher(String id, String name, Date birth, String subjectName) {
		super(id, name, birth);
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
}

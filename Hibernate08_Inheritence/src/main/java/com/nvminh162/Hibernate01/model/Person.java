package com.nvminh162.Hibernate01.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
	@Id
	private String id;
	private String name;
	private Date birth;
	
	public Person() {
	}
	
	public Person(String id, String name, Date birth) {
		this.id = id;
		this.name = name;
		this.birth = birth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", birth=" + birth + "]";
	}
	
}

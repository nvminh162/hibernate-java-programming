package com.nvminh162.Hibernate01.test;

import java.util.List;

import com.nvminh162.Hibernate01.dao.PersonDAO;
import com.nvminh162.Hibernate01.model.Person;

public class Test3 {
	public static void main(String[] args) {
		PersonDAO personDAO = new PersonDAO();
        List<Person> perList = personDAO.selectAll();
        perList.forEach(System.out::println);
	}
}

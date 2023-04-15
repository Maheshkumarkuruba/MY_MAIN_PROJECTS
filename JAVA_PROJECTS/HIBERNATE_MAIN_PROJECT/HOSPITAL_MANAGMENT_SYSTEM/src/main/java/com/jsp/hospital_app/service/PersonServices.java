package com.jsp.hospital_app.service;

import com.jsp.hospital_app.dao.imp.ItemDaoImpl;
import com.jsp.hospital_app.dao.imp.PersonDaoImpl;
import com.jsp.hospital_app.dto.Item;
import com.jsp.hospital_app.dto.Person;

public class PersonServices {
	PersonDaoImpl persondaoimpl =new PersonDaoImpl();
	public void savePerson(Person person,int bid) {
		Person person1 =persondaoimpl.savePerson(bid,person);
		if(person1!=null) {
			System.out.println("branch is save");
		}
		else {
			System.out.println("unfaortunatly data is not save");
		}
	}
	public Person getPersonById(int pid) {
		Person person=persondaoimpl.getPersonId(pid);
			if(person!=null) {
				return person;
			}
			else {
				return null;
			}
		}
	public void deletePersonById(int pid) {
		boolean flag=persondaoimpl.deletePersonId(pid);
		if(flag) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("data not found");
		}
	}
	public Person updatePersonById(int pid,Person person) {
		Person person1=persondaoimpl.updatePerson(pid,person);
		if(person1!=null) {
			return person1;
		}
		return null;
	}
}

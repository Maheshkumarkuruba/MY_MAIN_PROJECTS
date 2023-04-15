package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.Branch;
import com.jsp.hospital_app.dto.Observation;
import com.jsp.hospital_app.dto.Person;

public interface PersonDao {
	Person savePerson(int eid,Person person);
	Person getPersonId(int pid);
	boolean deletePersonId(int pid);
	Person updatePerson(int pid, Person person);
	List <Person> getAllperson();
	List <Person> getPersonByGender(String gender);
	List <Person> getPersonByAge(int age);
	List <Person> getPersonByphno(long phno);

}

package com.jsp.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hospital_app.dao.PersonDao;
import com.jsp.hospital_app.dto.Observation;
import com.jsp.hospital_app.dto.Person;

public class PersonDaoImpl implements PersonDao{

	public Person savePerson(int eid, Person person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return person;
	}

	public Person getPersonId(int pid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person=entityManager.find(Person.class,pid);
		return person;
	}

	public boolean deletePersonId(int pid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class,pid);
		if(person!=null) {
		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();
		return true;
		}
		return false;
	}

	public Person updatePerson(int pid, Person person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person1=entityManager.find(Person.class,pid);
		if(person1!=null) {
			person.setAddress(person1.getAddress());
			person.setAge(person1.getAge());
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
		return person;
		}
		return null;
	}

	public List<Person> getAllperson() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s");
		List<Person> person=query.getResultList();
		return person;
	}

	public List<Person> getPersonByGender(String gender) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s where gender=?");
		List<Person> person=query.getResultList();
		return person;
	}

	public List<Person> getPersonByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> getPersonByphno(long phno) {
		// TODO Auto-generated method stub
		return null;
	}

}

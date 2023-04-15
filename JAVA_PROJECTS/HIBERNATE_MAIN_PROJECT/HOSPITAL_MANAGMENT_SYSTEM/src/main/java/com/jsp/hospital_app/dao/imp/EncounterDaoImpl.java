package com.jsp.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hospital_app.dao.EncounterDao;
import com.jsp.hospital_app.dto.Branch;
import com.jsp.hospital_app.dto.Encounter;

public class EncounterDaoImpl implements EncounterDao {

	public Encounter saveEncounter(int bid, Encounter encounter) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(encounter);
		entityTransaction.commit();
		return encounter;
	}

	public Encounter getEncounterId(int eid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Encounter encounter=entityManager.find(Encounter.class,eid);	
		return encounter;
	}

	public boolean deleteEncounterId(int eid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class,eid);	
		if(encounter!=null) {
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
		return true;
		}
		return false;
	}

	public Encounter updateEncounter(int eid, Encounter encounter) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter1=entityManager.find(Encounter.class,eid);	
		if(encounter1!=null) {
			encounter.setBranch(encounter1.getBranch());
			encounter.setDate_of_joing(encounter1.getDate_of_joing());
			entityTransaction.begin();
			entityManager.merge(encounter);
			entityTransaction.commit();
			return encounter;
		}
		return null;	
	}

	public List<Encounter> getAllEncounter() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Encounter s");
		List<Encounter> encounter=query.getResultList();
		return encounter;
	}

}

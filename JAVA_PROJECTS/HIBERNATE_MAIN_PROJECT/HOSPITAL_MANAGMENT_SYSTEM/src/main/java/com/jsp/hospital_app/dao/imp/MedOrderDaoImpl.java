package com.jsp.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hospital_app.dao.MedOrderDao;
import com.jsp.hospital_app.dto.Item;
import com.jsp.hospital_app.dto.MedOrder;

public class MedOrderDaoImpl implements MedOrderDao{

	public MedOrder saveMedorder(int eid, MedOrder medorder) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(medorder);
		entityTransaction.commit();
		return medorder;
	}

	public MedOrder getMedOrderId(int mid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		MedOrder medOrder=entityManager.find(MedOrder.class,mid);
		return medOrder;
	}

	public boolean deleteMedOrderId(int mid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedOrder medorder=entityManager.find(MedOrder.class,mid);
		if(medorder!=null) {
		entityTransaction.begin();
		entityManager.remove(medorder);
		entityTransaction.commit();
		return true;
		}
		return false;
	}

	public MedOrder updateMedOrder(int mid, MedOrder medorder) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedOrder medorder1=entityManager.find(MedOrder.class,mid);
		if(medorder1!=null) {
		medorder.setDname(medorder1.getDname());
		medorder.setOrderdate(medorder1.getOrderdate());
		entityTransaction.begin();
		entityManager.merge(medorder);
		entityTransaction.commit();
		return medorder;
		}
		return null;
	}

	public List<MedOrder> getAllMedOrder() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from MedOrder s");
		List<MedOrder> medorder=query.getResultList();
		return medorder;
	}

	public List<MedOrder> getMedOrderByDoctername(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}

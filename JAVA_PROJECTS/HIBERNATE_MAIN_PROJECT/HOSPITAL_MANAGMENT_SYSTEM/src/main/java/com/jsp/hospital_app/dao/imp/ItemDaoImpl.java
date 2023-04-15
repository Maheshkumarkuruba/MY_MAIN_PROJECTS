package com.jsp.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hospital_app.dao.ItemDao;
import com.jsp.hospital_app.dto.Branch;
import com.jsp.hospital_app.dto.Hospital;
import com.jsp.hospital_app.dto.Item;

public class ItemDaoImpl implements ItemDao {

	public Item saveItem(int iid, Item item) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
		return item;
	}

	public Item getItemId(int iid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Item item=entityManager.find(Item.class,iid);
		return item;
	}

	public boolean deleteItemId(int iid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item=entityManager.find(Item.class,iid);
		if(item!=null) {
		entityTransaction.begin();
		entityManager.remove(item);
		entityTransaction.commit();
		return true;
		}
		return false;
	}

	public Item updateItem(int iid, Item item) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item1=entityManager.find(Item.class,iid);
		if(item1!=null) {
		item.setName(item1.getName());
		item.setQuality(item1.getQuality());
		entityTransaction.begin();
		entityManager.merge(item);
		entityTransaction.commit();
		return item;
		}
		return null;
	}

	public List<Item> getAllItems() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Item s");
		List<Item> item=query.getResultList();
		return item;
	}

}

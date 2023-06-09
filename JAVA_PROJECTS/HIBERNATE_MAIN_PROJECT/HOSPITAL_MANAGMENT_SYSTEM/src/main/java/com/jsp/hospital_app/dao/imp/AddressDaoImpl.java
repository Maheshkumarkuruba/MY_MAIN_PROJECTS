package com.jsp.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hospital_app.dao.AddressDao;
import com.jsp.hospital_app.dto.Address;
import com.jsp.hospital_app.dto.Branch;
import com.jsp.hospital_app.dto.Hospital;

public class AddressDaoImpl implements AddressDao{

	public Address saveAddress(int bid, Address address) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
		return address;
	}

	public Address getAddressId(int aid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Address address=entityManager.find(Address.class,aid);	
		return address;
	}

	public boolean deleteAddressId(int aid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Address address=entityManager.find(Address.class,aid);	
		if(address!=null) {
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
		return true;
		}
		return false;
	}

	public Address updateAddress(int aid, Address address) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Address address1=entityManager.find(Address.class,aid);	
		if(address1!=null) {
			address.setCountry(address1.getCountry());
			address.setStreet(address1.getStreet());
			entityTransaction.begin();
			entityManager.merge(address);
			entityTransaction.commit();
			return address;
		}
		return null;	
	}

	public List<Address> getAdressAll() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Address s");
		List<Address> address=query.getResultList();
		return address;
	}

	

}

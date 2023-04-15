package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.MedOrder;
import com.jsp.hospital_app.dto.Observation;

public interface MedOrderDao {
	MedOrder saveMedorder(int eid,MedOrder medorder);
	MedOrder getMedOrderId(int mid);
	boolean deleteMedOrderId(int mid);
	MedOrder updateMedOrder(int mid, MedOrder medorder);
	List <MedOrder> getAllMedOrder();
	List <MedOrder> getMedOrderByDoctername(String name);
}

package com.jsp.hospital_app.service;

import com.jsp.hospital_app.dao.imp.MedOrderDaoImpl;
import com.jsp.hospital_app.dto.MedOrder;

public class MedOrderServices {
	MedOrderDaoImpl medorderdaoimpl =new MedOrderDaoImpl();
	public void saveMedOrder(MedOrder medorder,int bid) {
		MedOrder medorder1 =medorderdaoimpl.saveMedorder(bid,medorder);
		if(medorder1!=null) {
			System.out.println("branch is save");
		}
		else {
			System.out.println("unfaortunatly data is not save");
		}
	}
	public MedOrder getMedOrderById(int mid) {
		MedOrder medorder=medorderdaoimpl.getMedOrderId(mid);
		if(medorder!=null) {
			return medorder;
		}
		else {
			return null;
		}
	}
	public void deleteMedOrderById(int mid) {
		boolean flag=medorderdaoimpl.deleteMedOrderId(mid);
		if(flag) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("data not found");
		}
	}
	public MedOrder updateMedOrderById(int mid,MedOrder medorder) {
		MedOrder medorder1=medorderdaoimpl.updateMedOrder(mid,medorder);
		if(medorder1!=null) {
			return medorder1;
		}
		return null;
	}
}

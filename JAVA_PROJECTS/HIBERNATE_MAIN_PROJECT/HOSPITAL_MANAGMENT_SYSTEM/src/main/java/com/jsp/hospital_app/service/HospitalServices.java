package com.jsp.hospital_app.service;

import com.jsp.hospital_app.dao.imp.HospitalDaoImpl;
import com.jsp.hospital_app.dto.Hospital;

public class HospitalServices {
	public void saveHospital(Hospital hospital) {
		HospitalDaoImpl daoimp=new HospitalDaoImpl();
		Hospital hospital1=daoimp.saveHospital(hospital);
		if(hospital1!=null) {
			System.out.println("data is saved");
		}
		else {
			System.out.println("unfortunatley data is not saved");
		}
	}
	
	public Hospital getHospitalById(int hid) {
		HospitalDaoImpl daoimp=new HospitalDaoImpl();
		Hospital hospital=daoimp.getHospitalId(hid);
		if(hospital!=null) {
			return hospital;
		}
		else {
			return null;
		}
	}
	public void deleteHospitalById(int hid) {
		HospitalDaoImpl daoimp=new HospitalDaoImpl();
		boolean flag=daoimp.deletehospitalId(hid);
		if(flag) {
			System.out.println("data dellete");
		}
		else {
			System.out.println("data not found");
		}
	}
	public Hospital updateHospitalById(int hid,Hospital hospital) {
		HospitalDaoImpl daoimp=new HospitalDaoImpl();
		Hospital hospital1=daoimp.updateHospital(hid,hospital);
		if(hospital1!=null) {
			return hospital1;
		}
		return null;
	}
}

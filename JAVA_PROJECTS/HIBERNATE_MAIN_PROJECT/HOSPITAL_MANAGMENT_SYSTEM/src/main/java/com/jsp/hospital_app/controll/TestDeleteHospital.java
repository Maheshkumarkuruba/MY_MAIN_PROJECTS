package com.jsp.hospital_app.controll;

import com.jsp.hospital_app.dto.Hospital;
import com.jsp.hospital_app.service.HospitalServices;

public class TestDeleteHospital {
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		HospitalServices service=new HospitalServices();
		service.deleteHospitalById(2);
		
	}
}

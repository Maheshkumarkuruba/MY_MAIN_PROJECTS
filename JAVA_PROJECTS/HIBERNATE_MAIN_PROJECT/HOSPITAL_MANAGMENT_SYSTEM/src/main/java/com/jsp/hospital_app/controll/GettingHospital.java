package com.jsp.hospital_app.controll;

import com.jsp.hospital_app.dto.Hospital;
import com.jsp.hospital_app.service.HospitalServices;

public class GettingHospital {
public static void main(String[] args) {
	HospitalServices service=new HospitalServices();
	Hospital hospital=service.getHospitalById(2);
	System.out.println(hospital.getHid());
	System.out.println(hospital.getName());
	System.out.println(hospital.getWebsite());
	
}
}

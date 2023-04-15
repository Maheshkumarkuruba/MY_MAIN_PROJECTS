package com.jsp.hospital_app.controll;

import com.jsp.hospital_app.dto.Hospital;
import com.jsp.hospital_app.service.HospitalServices;

public class TestUpdateHospital {
public static void main(String[] args) {
	Hospital hospital=new Hospital();
	HospitalServices service=new HospitalServices();
	hospital.setName("jayadev");
	hospital.setWebsite("www.jayadev.com");
	service.updateHospitalById(2,hospital);
}
}

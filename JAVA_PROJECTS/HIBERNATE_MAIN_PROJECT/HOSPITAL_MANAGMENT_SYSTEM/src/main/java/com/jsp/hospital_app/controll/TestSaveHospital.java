package com.jsp.hospital_app.controll;

import com.jsp.hospital_app.dto.Hospital;
import com.jsp.hospital_app.service.HospitalServices;

public class TestSaveHospital {
public static void main(String[] args) {
	Hospital hospital=new Hospital();
	HospitalServices service=new HospitalServices();
	hospital.setName("kims");
	hospital.setWebsite("www.kims.com");
	service.saveHospital(hospital);
	
}
}

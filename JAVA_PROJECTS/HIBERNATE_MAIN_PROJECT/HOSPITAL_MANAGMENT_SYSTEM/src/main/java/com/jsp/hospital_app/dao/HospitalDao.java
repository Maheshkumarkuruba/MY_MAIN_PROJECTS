package com.jsp.hospital_app.dao;

import com.jsp.hospital_app.dto.Hospital;

public interface HospitalDao {
	Hospital saveHospital(Hospital hospital);
	Hospital getHospitalId(int hid);
	boolean deletehospitalId(int hid);
	Hospital updateHospital(int hid, Hospital hospital);

}

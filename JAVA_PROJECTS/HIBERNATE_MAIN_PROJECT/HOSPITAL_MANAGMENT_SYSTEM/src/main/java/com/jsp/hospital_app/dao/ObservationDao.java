package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.Branch;
import com.jsp.hospital_app.dto.Observation;

public interface ObservationDao {
	Observation saveObservation(int eid,Observation observation);
	Observation getObservationId(int oid);
	boolean deleteObservationId(int oid);
	Observation updateObservation(int oid, Observation observation);
	List <Observation> getAllObservation();
	List <Observation> getObservationByDoctername(String name);
}

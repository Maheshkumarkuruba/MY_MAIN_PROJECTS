package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.Encounter;
import com.jsp.hospital_app.dto.Hospital;

public interface EncounterDao {
	Encounter saveEncounter(int bid,Encounter encounter);
	Encounter getEncounterId(int eid);
	boolean deleteEncounterId(int eid);
	Encounter updateEncounter(int eid, Encounter encounter);
	List<Encounter> getAllEncounter();

}

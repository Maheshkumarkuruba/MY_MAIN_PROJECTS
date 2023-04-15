package com.jsp.hospital_app.service;

import com.jsp.hospital_app.dao.imp.AddressDaoImpl;
import com.jsp.hospital_app.dao.imp.EncounterDaoImpl;
import com.jsp.hospital_app.dto.Address;
import com.jsp.hospital_app.dto.Encounter;

public class EncounterServices {
	EncounterDaoImpl encounterdaoimpl =new EncounterDaoImpl();
	public void saveEncounter(Encounter encounter,int bid) {
		Encounter encounter1 =encounterdaoimpl.saveEncounter(bid,encounter);
		if(encounter1!=null) {
			System.out.println("branch is save");
		}
		else {
			System.out.println("unfaortunatly data is not save");
		}
	}
	public Encounter getEncounterById(int eid) {
		Encounter encounter=encounterdaoimpl.getEncounterId(eid);
			if(encounter!=null) {
				return encounter;
			}
			else {
				return null;
			}
		}
	public void deleteEncounterById(int eid) {
		boolean flag=encounterdaoimpl.deleteEncounterId(eid);
		if(flag) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("data not found");
		}
	}
	
	public Encounter updateEncounterById(int aid,Encounter encounter) {
		Encounter encounter1=encounterdaoimpl.updateEncounter(aid,encounter);
		if(encounter1!=null) {
			return encounter1;
		}
		return null;
	}
	
}

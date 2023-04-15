package com.jsp.hospital_app.service;

import com.jsp.hospital_app.dao.imp.ObservationDaoImpl;
import com.jsp.hospital_app.dto.Observation;

public class ObservationServices {
	ObservationDaoImpl observationdaoimpl =new ObservationDaoImpl();
	public void saveObservation(Observation observation,int bid) {
		Observation observation1 =observationdaoimpl.saveObservation(bid,observation);
		if(observation1!=null) {
			System.out.println("branch is save");
		}
		else {
			System.out.println("unfaortunatly data is not save");
		}
	}
	public Observation getObsrvationById(int oid) {
		Observation observation=observationdaoimpl.getObservationId(oid);
		if(observation!=null) {
			return observation;
		}
		else {
			return null;
		}
	}
	public void deleteObsrvationById(int oid) {
		boolean flag=observationdaoimpl.deleteObservationId(oid);
		if(flag) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("data not found");
		}
	}
	public Observation updateObsrvationById(int mid,Observation observation) {
		Observation observation1=observationdaoimpl.updateObservation(mid,observation);
		if(observation1!=null) {
			return observation1;
		}
		return null;
	}
}

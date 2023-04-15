package com.jsp.hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Observation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	private String dname;
	private String observation;
	@ManyToOne
	@JoinColumn
	private Encounter encounters;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public Encounter getEncounter() {
		return encounters;
	}

	public void setEncounter(Encounter encounters) {
		this.encounters = encounters;
	}

}

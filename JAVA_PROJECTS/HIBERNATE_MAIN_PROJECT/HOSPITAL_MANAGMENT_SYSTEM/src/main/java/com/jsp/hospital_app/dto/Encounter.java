package com.jsp.hospital_app.dto;

import java.util.List;

import javax.persistence.*;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String reason;
	private String date_of_joing;
	private String discharge;
	@OneToMany(mappedBy="encounters")
	List<Observation> observations;
	@ManyToOne
	@JoinColumn
	private Person person;
	@ManyToOne
	@JoinColumn
	private Branch branches;
	@OneToMany(mappedBy="encounter")
	private List<MedOrder> medorder;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDate_of_joing() {
		return date_of_joing;
	}

	public void setDate_of_joing(String date_of_joing) {
		this.date_of_joing = date_of_joing;
	}

	public String getDischarge() {
		return discharge;
	}

	public void setDischarge(String discharge) {
		this.discharge = discharge;
	}

	public List<Observation> getObservation() {
		return observations;
	}

	public void setObservation(List<Observation> observations) {
		this.observations = observations;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Branch getBranch() {
		return branches;
	}

	public void setBranch(Branch branches) {
		this.branches = branches;
	}

	public List<MedOrder> getMedorder() {
		return medorder;
	}

	public void setMedorder(List<MedOrder> medorder) {
		this.medorder = medorder;
	}

}

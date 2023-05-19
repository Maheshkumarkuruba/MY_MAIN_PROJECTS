package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VehicleManagement {
	@Id
private int vehicleid;
private int price;
private String vehiclemodel;
private String vehiclecolor;
public int getVehicleid() {
	return vehicleid;
}
public void setVehicleid(int vehicleid) {
	this.vehicleid = vehicleid;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getVehiclemodel() {
	return vehiclemodel;
}
public void setVehiclemodel(String vehiclemodel) {
	this.vehiclemodel = vehiclemodel;
}
public String getVehiclecolor() {
	return vehiclecolor;
}
public void setVehiclecolor(String vehiclecolor) {
	this.vehiclecolor = vehiclecolor;
}
public VehicleManagement(int vehicleid, int price, String vehiclemodel, String vehiclecolor) {
	super();
	this.vehicleid = vehicleid;
	this.price = price;
	this.vehiclemodel = vehiclemodel;
	this.vehiclecolor = vehiclecolor;
}
@Override
public String toString() {
	return "VehicleManagement [vehicleid=" + vehicleid + ", price=" + price + ", vehiclemodel=" + vehiclemodel
			+ ", vehiclecolor=" + vehiclecolor + "]";
}
public VehicleManagement() {
	super();
	// TODO Auto-generated constructor stub
}

}

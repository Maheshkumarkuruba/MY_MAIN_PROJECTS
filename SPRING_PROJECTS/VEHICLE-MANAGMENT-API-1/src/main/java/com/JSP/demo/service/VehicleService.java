package com.JSP.demo.service;

import java.util.List;

import com.JSP.demo.module.Vehicle;

public interface VehicleService {
Vehicle addVehicle(Vehicle v);
Vehicle deleteVehicle(Integer vid);
List<Vehicle> allVehicles(Vehicle v);
Vehicle findById(Integer vid);
List<Vehicle> findByColor(String vcolor);
List<Vehicle> sortByVprice(Integer vprice);
Vehicle updateById(Vehicle v);
List<Vehicle> vpriceMore(Integer vprice);
List<Vehicle> sortByVprice_Color();
}

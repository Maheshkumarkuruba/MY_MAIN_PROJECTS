package com.JSP.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.JSP.demo.module.Vehicle;
import com.JSP.demo.service.VehicleService;

@RestController
public class Controller {
	@Autowired
VehicleService serv;
		@PostMapping("addvehicle")
	ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle v){
		return new ResponseEntity<Vehicle>(serv.addVehicle(v),HttpStatus.CREATED);
	}
		
		@DeleteMapping("deletevehicle")
		ResponseEntity<Vehicle> deleteVehicle(@RequestHeader Integer vid){
			return new ResponseEntity<Vehicle>(serv.deleteVehicle(vid),HttpStatus.OK);
		}
		
		@GetMapping("findvehicle")
		ResponseEntity<Vehicle> findByVehicle(@RequestHeader Integer vid){
			return new ResponseEntity<Vehicle>(serv.findById(vid),HttpStatus.FOUND);
		}
		
		@GetMapping("findbycolor")
		ResponseEntity<List<Vehicle>>findByColor(@RequestHeader String vcolor){
			return new ResponseEntity<List<Vehicle>>(serv.findByColor(vcolor),HttpStatus.FOUND);
		}
		
		@GetMapping("sortbyprice")
		ResponseEntity<List<Vehicle>>sortByVPrice(@RequestHeader Integer vprice){
			return new ResponseEntity<List<Vehicle>>(serv.sortByVprice(vprice),HttpStatus.FOUND);
		}
		
		@GetMapping("pricemorethen")
		ResponseEntity<List<Vehicle>>vpriceMore(@RequestHeader Integer vprice){
			return new ResponseEntity<List<Vehicle>>(serv.vpriceMore(vprice),HttpStatus.FOUND);
		}
		
		@GetMapping("findallvehicles")
		ResponseEntity<List<Vehicle>>findall(@RequestBody Vehicle v){
			return new ResponseEntity<List<Vehicle>>(serv.allVehicles(v),HttpStatus.FOUND);
		}
		
		@PutMapping("updatevehicle")
		ResponseEntity<Vehicle>updateVehicle(@RequestBody Vehicle v){
			return new ResponseEntity<Vehicle>(serv.updateById(v),HttpStatus.FOUND);
		}
		
}

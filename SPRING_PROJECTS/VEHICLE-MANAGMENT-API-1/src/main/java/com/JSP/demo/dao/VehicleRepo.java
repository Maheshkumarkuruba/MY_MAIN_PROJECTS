package com.JSP.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.JSP.demo.module.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle,Integer>{
	@Query(value = "select * from vehicle where vcolor=?1",nativeQuery=true)
	List<Vehicle> findByColor(String vcolor);
	@Query(value = "select * from vehicle order by vprice",nativeQuery=true)
	List<Vehicle> sortByVprice(Integer vprice);
	@Query(value = "select * from vehicle where vprice>=?1",nativeQuery=true)
	List<Vehicle> vpriceMore(Integer vprice);
}

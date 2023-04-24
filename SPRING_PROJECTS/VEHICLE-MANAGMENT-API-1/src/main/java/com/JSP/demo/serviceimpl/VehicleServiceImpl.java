package com.JSP.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.JSP.demo.dao.VehicleRepo;
import com.JSP.demo.exception.ResourceNotFoundException;
import com.JSP.demo.invalidexception.ResourceNotFound;
import com.JSP.demo.module.Vehicle;
import com.JSP.demo.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	VehicleRepo repo;

	@Override
	public Vehicle addVehicle(Vehicle v) {

		return  repo.save(v);
	}

	@Override
	public Vehicle deleteVehicle(Integer vid) {
		Vehicle v=(Vehicle) repo.findById(vid).orElse(null);
		if(v!=null) {
			repo.deleteById(vid);
			return v;
		}
		else {
			throw new ResourceNotFound("vehicle","vid",v.getVid());
		}
	}

	@Override
	public List<Vehicle> allVehicles(Vehicle v) {
		// TODO Auto-generated method stub
		List<Vehicle> dataList = repo.findAll();
	    return dataList;
		

	}

	@Override
	public Vehicle findById(Integer vid) {
	return	repo.findById(vid).orElseThrow(() -> new ResourceNotFound("Employee","id",vid));	
	}

	@Override
	public List<Vehicle> findByColor(String vcolor) {
		// TODO Auto-generated method stub
		List<Vehicle> v= repo.findByColor(vcolor);
		if(v!=null) {
			return v;
		}
		else {
			throw new ResourceNotFound("vehicle","vid",v);
		}
		
	}

	@Override
	public List<Vehicle> sortByVprice(Integer vprice) {
		List<Vehicle> v= repo.sortByVprice(vprice);
		if(v!=null) {
			return v;
		}
		else {
			throw new ResourceNotFound("vehicle","vid",v);
		}
	}

	@Override
	public Vehicle updateById(Vehicle v) {
		// TODO Auto-generated method stub
		Vehicle v1=(Vehicle) repo.findById(v.getVid()).orElse(null);
		if(v1!=null) {
			v1.setColor(v.getColor());
			v1.setVmodel(v.getVmodel());
			v1.setVprice(v.getVprice());
			v1.setVname(v.getVname());
			return repo.save(v1);
		}
		else {
			throw new ResourceNotFound("vehicle","vid",v.getVid());
		}
		
	}

	@Override
	public List<Vehicle> vpriceMore(Integer vprice) {
		// TODO Auto-generated method stub
		return repo.vpriceMore(vprice);
	}

	@Override
	public List<Vehicle> sortByVprice_Color() {
		// TODO Auto-generated method stub
		return null;
	}


}

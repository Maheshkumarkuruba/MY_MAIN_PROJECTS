package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.Address;
import com.jsp.hospital_app.dto.Branch;
import com.jsp.hospital_app.dto.Hospital;

public interface AddressDao {
	Address saveAddress(int bid,Address address);
	Address getAddressId(int aid);
	boolean deleteAddressId(int aid);
	Address updateAddress(int aid, Address address);
	List<Address> getAdressAll();
}

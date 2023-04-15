package com.jsp.hospital_app.service;

import com.jsp.hospital_app.dao.imp.AddressDaoImpl;
import com.jsp.hospital_app.dao.imp.BranchDaoImpl;
import com.jsp.hospital_app.dto.Address;
import com.jsp.hospital_app.dto.Branch;

public class AddressServices {
	AddressDaoImpl addressdaoimpl =new AddressDaoImpl();
	public void saveAddress(Address address,int bid) {
		Address address1=addressdaoimpl.saveAddress(bid,address);
		if(address1!=null) {
			System.out.println("branch is save");
		}
		else {
			System.out.println("unfaortunatly data is not save");
		}
	}
	
	public Address getBranchById(int aid) {
	Address address=addressdaoimpl.getAddressId(aid);
		if(address!=null) {
			return address;
		}
		else {
			return null;
		}
	}
	public void deleteAddressById(int aid) {
		boolean flag=addressdaoimpl.deleteAddressId(aid);
		if(flag) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("data not found");
		}
	}
	public Address updateAddressById(int aid,Address address) {
		Address address1=addressdaoimpl.updateAddress(aid,address);
		if(address1!=null) {
			return address1;
		}
		return null;
	}
}

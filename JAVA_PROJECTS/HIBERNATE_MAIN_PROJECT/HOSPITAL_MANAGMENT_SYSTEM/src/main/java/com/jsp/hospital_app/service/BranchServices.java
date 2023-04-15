package com.jsp.hospital_app.service;

import com.jsp.hospital_app.dao.imp.BranchDaoImpl;
import com.jsp.hospital_app.dao.imp.HospitalDaoImpl;
import com.jsp.hospital_app.dto.Branch;
import com.jsp.hospital_app.dto.Hospital;

public class BranchServices {
public void saveBranch(Branch branch,int hid) {
	BranchDaoImpl branchDaoImpl=new BranchDaoImpl();
	Branch branch2=branchDaoImpl.saveBranch(hid, branch);
	if(branch!=null) {
		System.out.println("branch is save");
	}
	else {
		System.out.println("unfaortunatly data is not save");
	}
}
	
public Branch getBranchById(int bid) {
	BranchDaoImpl branchDaoImpl=new BranchDaoImpl();
	Branch branch2=branchDaoImpl.getBranchId(bid);
	if(branch2!=null) {
		return branch2;
	}
	else {
		return null;
	}
}
public void deleteBranchById(int bid) {
	BranchDaoImpl branchDaoImpl=new BranchDaoImpl();
	boolean flag=branchDaoImpl.deleteBranchId(bid);
	if(flag) {
		System.out.println("data deleted");
	}
	else {
		System.out.println("data not found");
	}
}
public Branch updateBranchById(int hid,Branch branch) {
	BranchDaoImpl branchDaoImpl=new BranchDaoImpl();
	Branch branch1=branchDaoImpl.updateBranch(hid,branch);
	if(branch1!=null) {
		return branch1;
	}
	return null;
}

}

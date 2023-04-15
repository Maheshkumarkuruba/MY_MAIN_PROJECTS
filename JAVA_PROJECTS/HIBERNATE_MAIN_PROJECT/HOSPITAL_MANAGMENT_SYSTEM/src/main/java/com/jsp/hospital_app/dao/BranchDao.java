package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.Branch;
import com.jsp.hospital_app.dto.Hospital;

public interface BranchDao {
	Branch saveBranch(int hid,Branch branch);
	Branch getBranchId(int bid);
	boolean deleteBranchId(int bid);
	Branch updateBranch(int bid, Branch branch);
	List <Branch> getAllBraches();
}

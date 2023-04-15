package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.Branch;
import com.jsp.hospital_app.dto.Person;
import com.jsp.hospital_app.dto.User;

public interface UserDao {
	User saveUser(User user);
	User getUserId(int uid);
	boolean deleteUserId(int uid);
	User updateUser(int uid, User user);
	List <User> getAllUsers();	
	List <User> getUserByRole(String role);
}

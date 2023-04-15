package com.jsp.hospital_app.service;

import com.jsp.hospital_app.dao.imp.ObservationDaoImpl;
import com.jsp.hospital_app.dao.imp.UserDaoImpl;
import com.jsp.hospital_app.dto.Observation;
import com.jsp.hospital_app.dto.User;

public class UserServices {
	UserDaoImpl userdaoimpl =new UserDaoImpl();
	public void saveUser(User user,int bid) {
		User user1 =userdaoimpl.saveUser(user);
		if(user1!=null) {
			System.out.println("branch is save");
		}
		else {
			System.out.println("unfaortunatly data is not save");
		}
	}
	public User getUserById(int uid) {
		User user=userdaoimpl.getUserId(uid);
		if(user!=null) {
			return user;
		}
		else {
			return null;
		}
	}
	public void deleteUserById(int uid) {
		boolean flag=userdaoimpl.deleteUserId(uid);
		if(flag) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("data not found");
		}
	}
	public User updateUserById(int mid,User user) {
		User user1=userdaoimpl.updateUser(mid,user);
		if(user1!=null) {
			return user1;
		}
		return null;
	}
}

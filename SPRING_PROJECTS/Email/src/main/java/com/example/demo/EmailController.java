package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//localhost:9091
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
@Controller
public class EmailController {
	@Autowired
	VehicleRepo repo;

	@RequestMapping("login")
	String loginUser() {
		return "login.jsp";
	}
	
	@RequestMapping("validate")
	String validateUser(String email,String password) {
		if(email.equals("admin@gmail.com")&&password.equals("Admin@123")) {
			return "welcome.jsp";
		}
	return "error.jsp";
}
	@RequestMapping("addv")
	String addv(HttpSession h,VehicleManagement v) {
		return "addv.jsp";
	}
	@RequestMapping("save")
	String save(HttpSession h,VehicleManagement v) {
//		h.setAttribute("details", v);
		repo.save(v);
		return "details.jsp";
	}
	@RequestMapping("deletev")
	String deletev() {
		return "deletev.jsp";
	}
	
//	@RequestMapping("deletev")
//	String deletedetalis(HttpSession h,Integer vehicleid ) {
////		VehicleManagement v=repo.deleteById(vehicleid).orElse(null);
////		h.setAttribute("deleted_details",v);
//		return "deletev.jsp";
//	}
	
	@RequestMapping("findv")
	String findv() {
		return "findv.jsp";
	}
	
	@RequestMapping("finddetails")
	String finddetails(HttpSession h,Integer vehicleid) {
		VehicleManagement v=repo.findById(vehicleid).orElse(null);
		if(vehicleid==1231) {
		h.setAttribute("find_details", v);
		return "find_details.jsp";
		}
		return"ivalid.jsp";
}
	
}
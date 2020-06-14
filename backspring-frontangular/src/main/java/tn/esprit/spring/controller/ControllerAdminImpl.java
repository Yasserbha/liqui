package tn.esprit.spring.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import tn.esprit.spring.entities.Admin;
import tn.esprit.spring.services.IAdminService;


@Controller
public class ControllerAdminImpl {
	@Autowired
	IAdminService adminservice;
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-users
		@GetMapping("/retrieve-all-Admin")
		@ResponseBody
		public List<Admin> getAdmin() {
		List<Admin> list= adminservice.retrieveAllAdmin();
		return list;
		}
		// http://localhost:8081/SpringMVC/servlet/retrieve-user/{user-id}
		@GetMapping("/retrieve-Admin/{Admin-id}")
		@ResponseBody
		public Admin retrieveAdmin(@PathVariable("Admin-id") Long AdminId) {
		return adminservice.retrieveAdmin(AdminId);
		}
		// Ajouter User : http://localhost:8081/SpringMVC/servlet/add-user
		@PostMapping("/add-Admin")
		@ResponseBody
		public Admin addAdmin(@RequestBody Admin u) throws NoSuchAlgorithmException {
			Admin user= adminservice.addAdmin(u);
		return user;
		}
		// http://localhost:8081/SpringMVC/servlet/remove-user/{user-id}
		@DeleteMapping("/remove-Admin/{Admin-id}")
		@ResponseBody
		public void removeUser(@PathVariable("Admin-id") Long AdminId) {
			adminservice.deleteAdmin(AdminId);
		}

}

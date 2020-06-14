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


import tn.esprit.spring.entities.Client;

import tn.esprit.spring.services.IClientService;
@Controller
public class ControllerClientImpl {
	
	@Autowired
	IClientService clientservice;
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-users
		@GetMapping("/retrieve-all-Client")
		@ResponseBody
		public List<Client> getClient() {
		List<Client> list= clientservice.retrieveAllClient();
		return list;
		}
		// http://localhost:8081/SpringMVC/servlet/retrieve-user/{user-id}
		@GetMapping("/retrieve-Client/{Client-id}")
		@ResponseBody
		public Client retrieveClient(@PathVariable("Client-id") Long Id) {
		return clientservice.retrieveClient(Id);
		}
		// Ajouter User : http://localhost:8081/SpringMVC/servlet/add-user
		@PostMapping("/add-Client")
		@ResponseBody
		public Client addClient(@RequestBody Client u) throws NoSuchAlgorithmException {
			Client user= clientservice.addClient(u);
		return user;
		}
		// http://localhost:8081/SpringMVC/servlet/remove-user/{user-id}
		@DeleteMapping("/remove-Client/{Client-id}")
		@ResponseBody
		public void removeClient(@PathVariable("Client-id") Long Id) {
			clientservice.deleteClient(Id);;
		}

}

package tn.esprit.spring.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


import tn.esprit.spring.entities.Produit;

import tn.esprit.spring.services.IProduitService;
@CrossOrigin(origins = "*")
@Controller
public class ControllerProduitImpl {
	
	@Autowired
	IProduitService produitservice;
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-users
		@GetMapping("/retrieve-all-Produit")
		@ResponseBody
		public List<Produit> getProduit() {
		List<Produit> list= produitservice.retrieveAllProduit();
		return list;
		}
		// http://localhost:8081/SpringMVC/servlet/retrieve-user/{user-id}
		@GetMapping("/retrieve-Produit/{Produit-id}")
		@ResponseBody
		public Produit retrieveProduit(@PathVariable("Produit-id") Long Id) {
		return produitservice.retrieveProduit(Id);
		}
		// Ajouter User : http://localhost:8081/SpringMVC/servlet/add-user
		@PostMapping("/add-Produit")
		@ResponseBody
		public Produit addClient(@RequestBody Produit u) throws NoSuchAlgorithmException {
			Produit user= produitservice.addProduit(u);
		return user;
		}
		// http://localhost:8081/SpringMVC/servlet/remove-user/{user-id}
		@DeleteMapping("/remove-Produit/{Produit-id}")
		@ResponseBody
		public void removeProduit(@PathVariable("Produit-id") Long Id) {
			produitservice.deleteProduit(Id);
		}


}

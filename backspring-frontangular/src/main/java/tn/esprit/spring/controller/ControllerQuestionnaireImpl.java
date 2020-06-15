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
import tn.esprit.spring.entities.Questionnaire;
import tn.esprit.spring.services.IProduitService;
import tn.esprit.spring.services.IQuestionnaireService;
@CrossOrigin(origins = "*")
@Controller
public class ControllerQuestionnaireImpl {
	
	@Autowired
	IQuestionnaireService questionnaireservice;
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-users
		@GetMapping("/retrieve-all-Questionnaire")
		@ResponseBody
		public List<Questionnaire> getQuestionnaire() {
		List<Questionnaire> list= questionnaireservice.retrieveAllQuestionnaire();
		return list;
		}
		// http://localhost:8081/SpringMVC/servlet/retrieve-user/{user-id}
		@GetMapping("/retrieve-Questionnaire/{Questionnaire-id}")
		@ResponseBody
		public Questionnaire retrieveProduit(@PathVariable("Questionnaire-id") Long Id) {
		return questionnaireservice.retrieveCustomer(Id);
		}
		// Ajouter User : http://localhost:8081/SpringMVC/servlet/add-user
		@PostMapping("/add-Questionnaire")
		@ResponseBody
		public Questionnaire addClient(@RequestBody Questionnaire u) throws NoSuchAlgorithmException {
			Questionnaire user= questionnaireservice.addQuestionnaire(u);
		return user;
		}
		// http://localhost:8081/SpringMVC/servlet/remove-user/{user-id}
		@DeleteMapping("/remove-Questionnaire/{Questionnaire-id}")
		@ResponseBody
		public void removeProduit(@PathVariable("Questionnaire-id") Long Id) {
			questionnaireservice.deleteQuestionnaire(Id);
		}


}

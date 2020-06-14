package tn.esprit.spring.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Questionnaire;


@Repository
public interface IQuestionnaireService {
	
	Questionnaire addQuestionnaire(Questionnaire a);
	
	List<Questionnaire> retrieveAllQuestionnaire();
	
	void deleteQuestionnaire(Long id);
	
	Questionnaire retrieveCustomer(Long id);


}

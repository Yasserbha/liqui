package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Questionnaire;
import tn.esprit.spring.repository.QuestionnaiRerepository;

@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService {
	
	private static final Logger L= LogManager.getLogger(QuestionnaireServiceImpl.class);
	
		
	@Autowired
	QuestionnaiRerepository questionnaiRerepository;
		
	@Override
	public Questionnaire addQuestionnaire(Questionnaire a) {
		
		return questionnaiRerepository.save(a);
	}

	@Override
	public List<Questionnaire> retrieveAllQuestionnaire() {
		
		return (List<Questionnaire>) questionnaiRerepository.findAll();
	}

	@Override
	public void deleteQuestionnaire(Long id) {
		questionnaiRerepository.deleteById(id);
		
	}

	@Override
	public Questionnaire retrieveCustomer(Long id) {
		Questionnaire u= questionnaiRerepository.findById((id)).orElse(null);;
		L.info("retrive Customer by id ++++:"+u);
		return u;
	}

}

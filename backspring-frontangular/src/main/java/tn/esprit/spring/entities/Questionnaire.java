package tn.esprit.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="QUESTIONNAIRE")
public class Questionnaire {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="Id")
	private Long qId;
	
	
	private String Freponse;
	
	private String Sreponse;
	
	private String Treponse;
	
	
	@OneToOne(mappedBy="questionnaire")
	private User user;


	public Questionnaire() {
		super();
	}





	public Questionnaire(String freponse, String sreponse, String treponse, User user) {
		super();
		Freponse = freponse;
		Sreponse = sreponse;
		Treponse = treponse;
		this.user = user;
	}





	public Questionnaire(Long qId, String freponse,  String sreponse,String treponse, User user) {
		super();
		this.qId = qId;
	
		Freponse = freponse;
		
		Sreponse = sreponse;
		
		Treponse = treponse;
		
		this.user = user;
	}


	
	
	
	public String getFreponse() {
		return Freponse;
	}





	public void setFreponse(String freponse) {
		Freponse = freponse;
	}





	public String getSreponse() {
		return Sreponse;
	}





	public void setSreponse(String sreponse) {
		Sreponse = sreponse;
	}





	public String getTreponse() {
		return Treponse;
	}





	public void setTreponse(String treponse) {
		Treponse = treponse;
	}





	public Long getqId() {
		return qId;
	}


	public void setqId(Long qId) {
		this.qId = qId;
	}





	
	
	

}

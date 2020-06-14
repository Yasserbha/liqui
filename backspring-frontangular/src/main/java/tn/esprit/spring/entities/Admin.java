package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table(name="ADMIN")
@PrimaryKeyJoinColumn(name = "id")
public class Admin extends User implements Serializable {
	
	private String Cv;
	private String Pv;
	public Admin(String nom, String prenom, String email, String address, Date datenaissance, String password,
			int phoneNumber, Sexe sexe, Role role, Questionnaire questionnaire ,String cv, String pv) {
		super( nom,  prenom,  email,  address,  datenaissance,  password,
				 phoneNumber,  sexe,  role,  questionnaire);
		Cv = cv;
		Pv = pv;
	}
	public String getCv() {
		return Cv;
	}
	public void setCv(String cv) {
		Cv = cv;
	}
	public String getPv() {
		return Pv;
	}
	public void setPv(String pv) {
		Pv = pv;
	}
	
	
	
}

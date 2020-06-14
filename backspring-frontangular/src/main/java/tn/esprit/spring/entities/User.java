package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="USER")
@Inheritance(strategy = InheritanceType.JOINED)
public class User  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	private String nom;
	
	private String prenom;
	
	@Column(unique=true)
	private String email;
	
	@Column
	private String address; 
	
	@Temporal(TemporalType.DATE)
	private Date datenaissance ;
	
	@Column
	private String password;
	
	@Column
	private int phoneNumber;
	
	@Enumerated(EnumType.STRING)
	Sexe sexe;
	
	@Enumerated(EnumType.STRING)
	Role role;
	
	@OneToOne
	private Questionnaire questionnaire;

	public User() {
		super();
	}



	public User( String nom, String prenom, String email, String address, Date datenaissance, String password,
			int phoneNumber, Sexe sexe, Role role) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.address = address;
		this.datenaissance = datenaissance;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.sexe = sexe;
		this.role = role;
	}



	public User(String nom, String prenom, String email, String address, Date datenaissance, String password,
			int phoneNumber, Sexe sexe, Role role, Questionnaire questionnaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.address = address;
		this.datenaissance = datenaissance;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.sexe = sexe;
		this.role = role;
		this.questionnaire = questionnaire;
	}



	public Date getDatenaissance() {
		return datenaissance;
	}



	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}

	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}
	
	
	
	

}

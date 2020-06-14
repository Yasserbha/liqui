package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table(name="CLIENT")
@PrimaryKeyJoinColumn(name = "id")
public class Client  extends User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String job;
	private double salary;
	private boolean actif;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="client")
    private Set<Produit> Produits;

	public Client() {
		super();
	}

	public Client(String nom, String prenom, String email, String address, Date datenaissance, String password,
			int phoneNumber, Sexe sexe, Role role,Questionnaire questionnaire,String job, double salary, boolean actif, Set<Produit> produits) {
		super( nom,  prenom,  email,  address,  datenaissance,  password,
				 phoneNumber,  sexe,  role,questionnaire);
		this.job = job;
		this.salary = salary;
		this.actif = actif;
		Produits = produits;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public Set<Produit> getProduits() {
		return Produits;
	}

	public void setProduits(Set<Produit> produits) {
		Produits = produits;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}

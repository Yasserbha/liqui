package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="PRODUIT")
public class Produit implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	// whatever you want to include in the table you add @Column
	
	private double price;
	
	private int nbrPieces;
	
	private String etat;
		
	private String location;
	
	private boolean Actif ; 
	
	private String description;
	
	private String image;
	
	private String video;
	
	
	
	
	@ManyToOne
	private Client client;


	public Produit() {
		super();
	}
	

	public Produit(double price, int nbrPieces, String etat, String location, boolean actif, String description) {
		super();
		this.price = price;
		this.nbrPieces = nbrPieces;
		this.etat = etat;
		this.location = location;
		Actif = actif;
		this.description = description;
	}


	public Produit(double price, int nbrPieces, String etat, String location, boolean actif,
			String description, Client client) {
		super();
		this.price = price;
		this.nbrPieces = nbrPieces;
		this.etat = etat;
		this.location = location;
		Actif = actif;
		this.description = description;
		this.client = client;
	}

	public Produit(Long id, double price, int nbrPieces, String etat, String location, boolean actif,
			String description, Client client) {
		super();
		this.id = id;
		this.price = price;
	
		this.nbrPieces = nbrPieces;
		this.etat = etat;
		this.location = location;
		Actif = actif;
		this.description = description;
		this.client = client;
	}
	
	


	public Produit(double price, int nbrPieces, String etat, String location, boolean actif, String description,
			String image, String video, Client client) {
		super();
		this.price = price;
		this.nbrPieces = nbrPieces;
		this.etat = etat;
		this.location = location;
		Actif = actif;
		this.description = description;
		this.image = image;
		this.video = video;
		this.client = client;
	}
	
	


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getVideo() {
		return video;
	}


	public void setVideo(String video) {
		this.video = video;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}




	public int getNbrPieces() {
		return nbrPieces;
	}


	public void setNbrPieces(int nbrPieces) {
		this.nbrPieces = nbrPieces;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public boolean isActif() {
		return Actif;
	}


	public void setActif(boolean actif) {
		Actif = actif;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	
	

}

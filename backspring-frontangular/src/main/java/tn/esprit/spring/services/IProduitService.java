package tn.esprit.spring.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Produit;
@Repository
public interface IProduitService {
	
	Produit addProduit(Produit a);
	
	List<Produit> retrieveAllProduit();
	
	void deleteProduit(Long id);
	
	Produit retrieveProduit(Long id);

}

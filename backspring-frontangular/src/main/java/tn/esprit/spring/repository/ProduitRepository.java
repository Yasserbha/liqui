package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.entities.User;


@Repository
public interface ProduitRepository extends CrudRepository<Produit,Long> {
	
	@Query("SELECT e FROM Produit e WHERE e.client=:client")
	public Produit getProduitbyClient(@Param("client")Client client);
	
	


}

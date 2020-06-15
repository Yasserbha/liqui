package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.ProduitRepository;
@Service
public class ProduitServiceImpl implements IProduitService  {
	
	private static final Logger L= LogManager.getLogger(ProduitServiceImpl.class);
	
	@Autowired
	ProduitRepository produitRepository ;
	
	@Autowired
	AdminServiceImpl adminserviceImpl;
	
	@Override
	public Produit addProduit(Produit a) {
	
	a.setClient(adminserviceImpl.getClient());
	return produitRepository.save(a);
	}

	@Override
	public List<Produit> retrieveAllProduit() {
		
		return (List<Produit>) produitRepository.findAll();
	}

	@Override
	public void deleteProduit(Long id) {
		produitRepository.deleteById(id);
		
	}

	@Override
	public Produit retrieveProduit(Long id) {
		Produit u= produitRepository.findById((id)).orElse(null);;
		L.info("retrive Customer by id ++++:"+u);
		return u;
	}

	@Override
	public Produit getProduitbyClient(Client idclient) {
		
		return produitRepository.getProduitbyClient(idclient);
	}

}

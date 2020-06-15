package tn.esprit.spring;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.ProduitRepository;
import tn.esprit.spring.services.IAdminService;
import tn.esprit.spring.services.IClientService;
import tn.esprit.spring.services.IProduitService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BackspringFrontangularApplicationTests {

	
	@Autowired
	IAdminService sadmin ;
	
	@Autowired
	IClientService sclient ;
	
	@Autowired
	IProduitService sproduit ;
	
	@Test
	public void contextLoads() {
		
		
		User u = new User();
		u=sadmin.getAuthentification("yes@esprit.tn", "yasser");
		
		Client c = new Client();
		c = sclient.retrieveClient(u.getId());
		
		//Produit p = new Produit(222,33,"bien","djerba",true,"nice",c);
		Produit p = new Produit();
		p=sproduit.getProduitbyClient(c);
		System.out.println(p.getDescription());
		
		
		
		
		
	}

}

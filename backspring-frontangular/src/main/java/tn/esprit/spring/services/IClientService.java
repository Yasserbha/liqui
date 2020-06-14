package tn.esprit.spring.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Client;

@Repository
public interface IClientService {
	
	Client addClient(Client a);
	
	List<Client> retrieveAllClient();
	
	void deleteClient(Long id);
	
	Client retrieveClient(Long id);


}

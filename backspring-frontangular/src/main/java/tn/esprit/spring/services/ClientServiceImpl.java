package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Client;

import tn.esprit.spring.repository.ClientRepository;
import tn.esprit.spring.security.AES;
@Service
public class ClientServiceImpl implements IClientService {
	
	private static final Logger L= LogManager.getLogger(ClientServiceImpl.class);
	
	final String secretKey = "yasserbelhajali2013";
	
	@Autowired
	ClientRepository clientrepository ;
	
	@Override
	public Client addClient(Client a) {
		 String encryptedString = AES.encrypt(a.getPassword(), secretKey) ;
		   a.setPassword(encryptedString);
		return clientrepository.save(a);
	}

	@Override
	public List<Client> retrieveAllClient() {
		// TODO Auto-generated method stub
		return (List<Client>) clientrepository.findAll();
	}

	@Override
	public void deleteClient(Long id) {
		clientrepository.deleteById(id);
		
	}

	@Override
	public Client retrieveClient(Long id) {
		Client u= clientrepository.findById((id)).orElse(null);;
		L.info("retrive Customer by id ++++:"+u);
		return u;
	}

}

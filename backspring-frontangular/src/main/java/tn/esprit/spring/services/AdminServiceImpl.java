package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Admin;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.AdminRepository;
import tn.esprit.spring.repository.ClientRepository;
import tn.esprit.spring.security.AES;
@Service
public class AdminServiceImpl implements IAdminService   {
	
	private static final Logger L= LogManager.getLogger(AdminServiceImpl.class);
	
	private Client client ;
	private Admin admin ;
	
	
	@Autowired
	AdminRepository	repositoryadmin;
	
	@Autowired
	IClientService serviceclient;
	
	final String secretKey = "yasserbelhajali2013";
	@Override
	public Admin addAdmin(Admin a) {
		   String encryptedString = AES.encrypt(a.getPassword(), secretKey) ;
		   a.setPassword(encryptedString);
		return repositoryadmin.save(a);
	}

	@Override
	public List<Admin> retrieveAllAdmin() {
		// TODO Auto-generated method stub
		return (List<Admin>) repositoryadmin.findAll();
	}

	@Override
	public void deleteAdmin(Long id) {
		repositoryadmin.deleteById(id);
		
	}

	@Override
	public Admin retrieveAdmin(Long id) {
		Admin u= repositoryadmin.findById((id)).orElse(null);;
		L.info("retrive Customer by id ++++:"+u);
		return u;
	}

	@Override
	public User getAuthentification(String email, String password) {
		 String encryptedString = AES.encrypt(password, secretKey) ;
		 password = encryptedString;
		 User u =new User();
		 Role x = null ;
		 u= repositoryadmin.getAuthentification(email, password);
		 if (u.getRole()== x.CLIENT)
		 {
			 client = serviceclient.retrieveClient(u.getId());
			 return client;  
		 }
		 else
		 admin = retrieveAdmin(u.getId());
		 return admin;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
}

package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Admin;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.repository.AdminRepository;
import tn.esprit.spring.security.AES;
@Service
public class AdminServiceImpl implements IAdminService   {
	
	private static final Logger L= LogManager.getLogger(AdminServiceImpl.class);
	@Autowired
	AdminRepository	repositoryadmin;
	
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
}

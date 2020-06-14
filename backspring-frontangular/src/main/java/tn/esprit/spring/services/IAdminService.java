package tn.esprit.spring.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Admin;
import tn.esprit.spring.entities.Client;
@Repository
public interface IAdminService {
	
	Admin addAdmin(Admin a);
	
	List<Admin> retrieveAllAdmin();
	
	void deleteAdmin(Long id);
	
	Admin retrieveAdmin(Long id);

}

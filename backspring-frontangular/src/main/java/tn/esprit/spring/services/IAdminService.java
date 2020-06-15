package tn.esprit.spring.services;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Admin;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.User;
@Repository
public interface IAdminService {
	
	Admin addAdmin(Admin a);
	
	List<Admin> retrieveAllAdmin();
	
	void deleteAdmin(Long id);
	
	Admin retrieveAdmin(Long id);
	
	User getAuthentification(String email,String password);

}

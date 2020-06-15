package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Admin;
import tn.esprit.spring.entities.User;



@Repository
public interface AdminRepository extends CrudRepository<Admin,Long> {
	
	@Query("SELECT e FROM User e WHERE e.password=:password and ( e.email=:email or e.phoneNumber=:email )")
	public User getAuthentification(@Param("email")String email, @Param("password")String password);

}

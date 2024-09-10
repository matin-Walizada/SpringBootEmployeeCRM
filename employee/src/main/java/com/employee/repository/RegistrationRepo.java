package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.Registration;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Long> {
	
	public Registration findUserByEmail(String userEmail);
	public Registration findUserByEmailAndPassword(String emailId, String password);
		
		
		
	 

}

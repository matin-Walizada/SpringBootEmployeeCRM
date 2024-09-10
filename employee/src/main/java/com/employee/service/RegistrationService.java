package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Registration;
import com.employee.repository.RegistrationRepo;

@Service
public class RegistrationService {
	
	// dependency Injection
	
	
	@Autowired
	RegistrationRepo  registrationRepo;
	
	// save user registration API
	
	public Registration saveUser(Registration register) {
		
		return registrationRepo.save(register);
	}
	
	
	
	// get all Users Api
	
	public List<Registration>  getAllUsers(){
		
		
		return registrationRepo.findAll();
	}
	
	
	// user login API
	
	public Registration findUserByEmailAndPassword(String emailId,  String password) {
		
		return registrationRepo.findUserByEmailAndPassword(emailId, password);
		
	}
	
	
	// get User By ID API
	
	public Optional<Registration> getUserById( Long id){
		
		return registrationRepo.findById(id);
	}
	
	
	
	// update user by ID API
	public void updateUser(Registration r, Long id) {
		
		if(id == r.getId()) {
			registrationRepo.save(r);
			
		}
		
	}
	
	
	
	// delete user by ID Api
	
	public void deleteUser(Long id) {
		
		
		registrationRepo.deleteById(id);
	}
	
	
	
	
// patch user by ID API
	public void patchUser(Registration reg, Long id) {
		
		if(id == reg.getId()) {
			registrationRepo.save(reg);
			
		}
	}
	
	
	
	
	

}

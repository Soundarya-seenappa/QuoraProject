package com.project.collegequora.service;

import com.project.collegequora.models.SystemUser;
import com.project.collegequora.models.SystemUserDetails;
import com.project.collegequora.repository.SystemUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;  
@Service
public class SystemUserDetailsService implements UserDetailsService 
{
	@Autowired
	SystemUserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException 
	{
		SystemUser user = userRepo.findByEmail(email);
		System.out.println("user : "+user);
		
		return new SystemUserDetails(user);
	}
}
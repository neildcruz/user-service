/**
 * 
 */
package com.example.init;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.Role;
import com.example.entity.User;
import com.example.repository.RoleRepository;
import com.example.repository.UserRepository;

/**
 * @author neildcruz
 *
 *
 */
@Component
public class DataLoad implements CommandLineRunner {
	
	
	private static final Logger log = LoggerFactory.getLogger(DataLoad.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	/* (non-Javadoc)
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... arg0) throws Exception {
		
		User user = new User();
		user.setUsername("user1");
		user.setPassword("password1");
		user.setAccountNonExpired(true);
		user.setAccountNonLocked(true);
		user.setCredentialsNonExpired(true);
		user.setEnabled(true);
		
		user = userRepository.saveAndFlush(user);
		log.info("User Id: " + user.getId());
		
		Role role = new Role();
		role.setRoleName("ADMIN");
		
		role = roleRepository.saveAndFlush(role);
		
		user.addRole(role);
		
		userRepository.save(user);
	}

}

package com.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hello.model.User;
import com.hello.model.UserRepository;
@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 
		User user = userRepository.findByusername(username);
		
		if(user==null)
			throw new UsernameNotFoundException("user not found");
		return new MyUserDetail(user.getUsername(), user.getPassword(), user.getAuthentication());
	}

}

package com.fagun.service;

import com.fagun.entity.User;
import com.fagun.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userByUsername = userRepository.findByUsername(username);
        userByUsername.orElseThrow(() -> new UsernameNotFoundException("NOT FOUND : " + username));
        return userByUsername.map(MyUserDetails::new).get();
    }
}

package com.example.todo.service;

import com.example.todo.model.User; 
import com.example.todo.repository.UserRepository; 
import org.springframework.beans.factory.annotation.Autowired; // Importing the Autowired annotation
import org.springframework.security.core.userdetails.UserDetails; // Importing the UserDetails interface
import org.springframework.security.core.userdetails.UserDetailsService; // Importing the UserDetailsService interface
import org.springframework.security.core.userdetails.UsernameNotFoundException; // Importing the UsernameNotFoundException class
import org.springframework.security.core.userdetails.User.UserBuilder; // Importing the UserBuilder class
import org.springframework.stereotype.Service; // Importing the Service annotation

@Service // Indicates that this class is a service component in the Spring context
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository; // Injecting the UserRepository dependency

    /**
     * Loads the user by username.
     *
     * @param username the username of the user to be loaded
     * @return UserDetails object containing user information
     * @throws UsernameNotFoundException if the user is not found in the repository
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Retrieve the User object for the given username
        User user = userRepository.findByUsername(username);
        
        // If the user is not found, throw an exception
        if (user == null) {
            throw new UsernameNotFoundException("User not found.");
        }
        
        // Create a UserBuilder object to build the UserDetails
        UserBuilder builder = org.springframework.security.core.userdetails.User.withUsername(username);
        builder.password(user.getPassword()); // Set the password for the UserDetails
        builder.roles(user.getRole()); // Set the roles for the UserDetails
        
        // Return the built UserDetails objects
        return builder.build();
    }
}

package ca.sait.services;

import ca.servlets.models.User;

/**
 * Service provider for account
 * @author Sean Ma
 */
public class AccountService {
    
    /**
     * Login a user
     * @param username  Username
     * @param password  Password
     * @return User instance if login credentials are correct, or null.
     */
    public User Login(String username, String password) {
        if (username == null) {
            return null;
        }
        
        if ("abe".equals(username) && "password".equals("password")) {
        
            return new User(username, password);
        
        } else if (username.equals("barb") && password.equals("password")) {
        
            User user = new User(username, password);
            return user;
        
        } else {
            return null;
        }
        
        
        
    }
}

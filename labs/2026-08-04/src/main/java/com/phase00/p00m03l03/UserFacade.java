package com.phase00.p00m03l03;

/**
 * UserFacade
 */
public class UserFacade {

    private final PasswordGenerator passGen = new PasswordGenerator();
    private final TokenGenerator tokenGen = new TokenGenerator();

    public String registerUser(String username,String rawPassword){
        if(username == null || username.trim().length() < 3){
            throw new IllegalArgumentException("Username must be atleast 3 characters!");
        }

        String hashedPassword = passGen.hash(rawPassword);
        System.out.println("User registered with hash : " + hashedPassword);
        return tokenGen.generateToken(username);
    }
    
}
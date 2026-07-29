package com.handbook.security;

/**
 * SecurityService
 */
public class SecurityService {

    public String registerUser(String user,String rawPassword){
        PasswordEncryptor p = new PasswordEncryptor();
        return p.encrypt(rawPassword);
    }
}
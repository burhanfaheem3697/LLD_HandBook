package com.phase00.p00m03l03;

/**
 * PasswordGenerator
 */
class PasswordGenerator {

    String hash(String rawPassword){
        if(rawPassword == null || rawPassword.trim().isEmpty()){
            throw new IllegalArgumentException("Password is required!");
        }
        return "HASHED_" + Integer.toHexString(rawPassword.hashCode());
    }
    
}
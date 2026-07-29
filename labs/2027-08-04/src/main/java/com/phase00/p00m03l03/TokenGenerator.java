package com.phase00.p00m03l03;

/**
 * TokenGenerator
 */
class TokenGenerator {

    String generateToken(String username){
        if(username == null || username.trim().isEmpty()){
            throw new IllegalArgumentException("username is required!");
        }

        return "TOKEN_" + username.trim().toUpperCase() + "_" + System.currentTimeMillis();
    }
    
}
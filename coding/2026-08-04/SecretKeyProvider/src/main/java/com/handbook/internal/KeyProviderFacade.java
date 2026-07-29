package com.handbook.internal;

/**
 * KeyProviderFacade
 */
public class KeyProviderFacade {

    private final SecretKey secretKey = new SecretKey();

    public String fetchToken(){
        return secretKey.getKey();
    }
}
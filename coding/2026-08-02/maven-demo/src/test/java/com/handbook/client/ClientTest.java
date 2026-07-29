package com.handbook.client;

import com.handbook.security.SecurityService;
import com.handbook.security.PasswordEncryptor;

/**
 * ClientTest
 */
public class ClientTest {

    public static void main(String[] args){
        SecurityService s = new SecurityService();

        PasswordEncryptor p = new PasswordEncryptor();

        System.out.println(p.encrypt("raw"));
    }
}
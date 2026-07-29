package com.handbook.external;

import com.handbook.internal.KeyProviderFacade;

/**
 * AppClient
 */
public class AppClient {

    public static void main(String[] args){
        KeyProviderFacade facade = new KeyProviderFacade();

        System.out.println(facade.fetchToken());
    }
}
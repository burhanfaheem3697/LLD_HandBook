package com.handbook.client;

import com.handbook.internal.PublicFacade;

/**
 * ClientApp
 */
public class ClientApp {

    public static void main(String[] args){
        PublicFacade p = new PublicFacade();

        System.out.println(p.getInfo());

    }
}
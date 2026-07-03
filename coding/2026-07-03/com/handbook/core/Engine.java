package com.handbook.core;
import com.handbook.components.Part;
import com.handbook.service.InternalConfig;

public class Engine{
    public static void main(String[] args) {
        Part part = new Part();
        System.out.println(part.getPart());
        InternalConfig config = new InternalConfig();
        System.out.println(config.getConfig());
    }
}
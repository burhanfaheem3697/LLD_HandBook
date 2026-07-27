package com.handbook.demo;

import java.io.InputStream;
import java.util.Properties;

/**
 * AppConfig
 */
public class AppConfig {

    private final Properties props = new Properties();

    public static void main(String[] args){
        AppConfig config = new AppConfig();
        try {
            config.load();
        } catch (Exception e) {
            System.out.println("Caught the exception : " + e.getClass().getName());
            System.out.println("Here is the message : " + e.getMessage());
        }
        String value = config.getAppName();

        System.out.println("Here is the value : " + value);
    }

    public void load() throws Exception{
        try(InputStream is = getClass().getClassLoader().getResourceAsStream("app.properties")){
            if(is == null) throw new IllegalStateException("app.properties not found on classpath");
            props.load(is);
        }

    }

    public String getAppName(){
        return props.getProperty("app.name");
    }
}
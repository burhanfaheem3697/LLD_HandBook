package com.example.cli_dispatcher;

/**
 * SimpleCliDispatcher
 */
public class SimpleCliDispatcher {

    public String dispatch(String[] args){
        if(args == null || args.length == 0){
            throw new IllegalArgumentException("No command provided. Usage : add|list|complete");
        }

        String action = args[0].trim().toUpperCase();

        switch(action){
            case "ADD": 
                if(args.length < 2) throw new IllegalArgumentException("Task description required for add");
                return "Executing ADD Tasks: " + args[1];
            case "LIST": 
                return "Executing LIST Tasks";
            case "COMPLETE":
                if(args.length < 2) throw new IllegalArgumentException("Task ID required for COMPLETE");
                return "Executing COMPLETE for ID: " + args[1];
            default:
                throw new IllegalArgumentException("Unknown command: " + action);


        }
    }
    
}
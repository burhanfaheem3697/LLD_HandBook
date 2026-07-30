package com.handbook.api;

import com.handbook.internal.PipelineEngine;

/**
 * PipelineFacade
 */
public class PipelineFacade {

    public static void main(String[] args){
       PipelineEngine engine = new PipelineEngine();

       engine.logEvent("Here is the event");
    }
    
}
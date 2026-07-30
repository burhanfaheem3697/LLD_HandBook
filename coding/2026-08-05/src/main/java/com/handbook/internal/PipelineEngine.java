package com.handbook.internal;

/**
 * PipelineEngine
 */
public class PipelineEngine {
    private final AuditLogger logger = new AuditLogger();
    public void logEvent(String event){
        logger.log(event);
    }
    
}
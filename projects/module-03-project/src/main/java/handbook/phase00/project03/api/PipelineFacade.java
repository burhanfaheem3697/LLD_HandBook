package handbook.phase00.project03.api;

import java.io.InputStream;
import java.util.Properties;

import handbook.phase00.project03.internal.PipelineEngine;

/**
 * PipelineFacade
 */
public class PipelineFacade {
    private final PipelineEngine engine = new PipelineEngine();
    private int defaultTimeout = 300;
    private String environment = "STAGING";

    public PipelineFacade(){
        loadClasspathDefaults();
    }

    private void loadClasspathDefaults(){
        try(InputStream is = getClass().getClassLoader().getResourceAsStream("pipeline-defaults.properties")){
            if(is != null){
                Properties props = new Properties();
                props.load(is);
                this.defaultTimeout = Integer.parseInt(props.getProperty("pipeline.default_timeout","300"));
                this.environment = props.getProperty("pipeline.environment","STAGING");
            }
        } catch (Exception e){
            System.err.println("Warning: Could not load pipeline-defaults.properties, using fallbacks");
        }
    }

    public int executePipeline(String pipelineName,int stepCount){
        if(pipelineName == null || pipelineName.trim().isEmpty()){
            throw new IllegalArgumentException("Pipeline is required");
        }

        return engine.calculateTotalExecutionTime(stepCount,defaultTimeout);
    }

    public String getEnvironment(){
        return environment;
    }

    public int getDefaultTimeout(){
        return defaultTimeout;
    }
    
}
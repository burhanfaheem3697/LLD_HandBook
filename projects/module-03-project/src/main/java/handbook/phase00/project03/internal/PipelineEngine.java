package handbook.phase00.project03.internal;

/**
 * PipelineEngine
 */
public class PipelineEngine {

    public int calculateTotalExecutionTime(int stepCount,int baseTimeout){
        if(stepCount <= 0){
            throw new IllegalArgumentException("Step count must be positive.");
        }

        return stepCount * baseTimeout;
    }
}
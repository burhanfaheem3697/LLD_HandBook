package handbook.phase00.project03;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import handbook.phase00.project03.api.PipelineFacade;

/**
 * PipelineFacadeTest
 */
public class PipelineFacadeTest {

    private PipelineFacade facade;

    @BeforeEach
    void setup(){
        facade = new PipelineFacade();
    }

    @Test
    void testClasspathPropertiesLoadedOnInitialization(){
        assertAll("Classpath properties check",
            () -> assertEquals(300,facade.getDefaultTimeout()),
            () -> assertEquals("STAGING",facade.getEnvironment())
        );
    }

    @Test
    void testPipelineExecutionCalculation(){
        int totalTime = facade.executePipeline("DeployJob", 5);
        assertEquals(1500, totalTime);
    }

    @Test
    void testInvalidStepCountThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> facade.executePipeline("DeployJob",0));
    }

    @Test
    void testNullPipelineThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> facade.executePipeline(null, 4));
    }



}
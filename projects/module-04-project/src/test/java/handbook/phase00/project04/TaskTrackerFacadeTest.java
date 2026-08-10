package handbook.phase00.project04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import handbook.phase00.project04.api.TaskTrackerFacade;
import handbook.phase00.project04.internal.Task;

/**
 * TaskTrackerFacadeTest
 */
public class TaskTrackerFacadeTest {

    private TaskTrackerFacade facade;

    @BeforeEach
    void setup(){
        facade = new TaskTrackerFacade();
    }

    @Test
    void testAddTaskSuccess(){
        Task task = facade.addTask("Write documentation");
        assertNotNull(task);
        assertEquals(1,task.getId());
        assertEquals("Write documentation", task.getDescription());
        assertFalse(task.isCompleted());
        
    }

    @Test
    void testCompleteTaskSuccess(){
        Task task = facade.addTask("Complete Capstone");
        facade.completeTask(task.getId());
        assertTrue(task.isCompleted());
    }

    @Test
    void testDuplicateTaskThrowsException(){
        facade.addTask("Study OOD");
        assertThrows(IllegalArgumentException.class, () -> facade.addTask("STUDY OOD"));
    }

    @Test
    void testCompleteInvalidTaskIdThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> facade.completeTask(999));
    }


}
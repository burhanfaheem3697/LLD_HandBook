package handbook.phase00.p00m04l03;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * TaskServiceTest
 */
public class TaskServiceTest {

    private TaskService taskService;

    @BeforeEach
    void setup(){
        taskService = new TaskService(new InMemoryRepository());
    }

    @Test
    void testCreateTaskSuccess(){
        TaskItem task = taskService.createTask("Write code");
        taskService.completeTask(task.getId());
        assertTrue(taskService.getTasks(false).get(0).isCompleted());
    }

    @Test
    void testDuplicateTaskThrowsException(){
        taskService.createTask("study java");
        assertThrows(IllegalArgumentException.class, () -> taskService.createTask("STUDY JAVA"));
    }

    @Test
    void testCompleteNonExistentTaskThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> taskService.completeTask(99));
    }
}
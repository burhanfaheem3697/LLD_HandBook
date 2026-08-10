package handbook.phase00.project04.api;

import java.util.List;

import handbook.phase00.project04.internal.Task;
import handbook.phase00.project04.internal.TaskService;

/**
 * TaskTrackerFacade
 */
public class TaskTrackerFacade {

    private final TaskService service = new TaskService();

    public Task addTask(String description){
        return service.addTask(description);
    }

    public void completeTask(int id){
        service.completeTask(id);
    }

    public boolean deleteTask(int id){
        return service.deleteTask(id);
    }

    public List<Task> getTasks(boolean onlyPending){
        return service.listTasks(onlyPending);
    }

}
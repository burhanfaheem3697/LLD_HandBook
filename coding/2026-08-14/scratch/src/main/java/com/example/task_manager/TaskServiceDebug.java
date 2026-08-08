package com.example.task_manager;


public class TaskServiceDebug {

    public void completeTask(TaskItem task){
        if(task == null){
            throw new IllegalArgumentException("Task can't be null");
        }

        if(task.isCompleted()){
            throw new IllegalStateException("Task is already completed");
        }

        task.markCompleted();
    }
}
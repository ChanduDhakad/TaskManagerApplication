package com.masai.Service;

import java.util.List;

import com.masai.Entity.Task;
import com.masai.Exception.TaskException;

public interface TaskService {

    public Task createTask(Task task); 
	public List<Task> getAllTask() throws TaskException;
    public Task updateTask(Integer taskId,Task task) throws TaskException;  
    public Task deleteTask(Integer taskId)throws TaskException;

}

package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Entity.Task;
import com.masai.Exception.TaskException;
import com.masai.Repository.TaskDao;

@Service
public class TaskServiceImpl  implements TaskService {

	@Autowired
	private TaskDao taskDao;
	
	@Override
	public Task createTask(Task task) {
       Task task2=null;		
		
        task2=taskDao.save(task);
		

		 return task2; 
	}
	

	@Override
	public List<Task> getAllTask() throws TaskException {
	List<Task> list=null;
	
	 list=taskDao.findAll();
	 if(list.size()==0) {
		 throw new TaskException("Task IS Not Available In The Data Base");
	 }
	 
	
	return list;
	}

	@Override
	public Task updateTask(Integer taskId, Task task) throws TaskException {
		Task task2=null;
	
    	Optional<Task> opt=taskDao.findById(taskId);
		
    	if(opt.isPresent()) {
     	 task2=taskDao.save(task);
    	}
    	else {
    		throw new TaskException("Task Is Not Available By Given Id");
    	}
    
		return task2;
	}

	@Override
	public Task deleteTask(Integer taskId) throws TaskException {
		Task task2=null;
		
    	Optional<Task> opt=taskDao.findById(taskId);
		
    	if(opt.isPresent()) {
    		task2=opt.get();
     	     taskDao.delete(task2);
    	}
    	else {
    		throw new TaskException("Task Is Not Available By Given Id");
    	}
    
		return task2;
	
		
	}



}

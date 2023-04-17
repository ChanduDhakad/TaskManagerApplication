package com.masai.Controller;

import java.util.List;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Task;
import com.masai.Exception.TaskException;
import com.masai.Service.TaskService;

@RestController
public class MasaiTaskController {

	
	 @Autowired
	 private TaskService service;
	 
     @PostMapping("/MasaiTask/task")
	 public ResponseEntity<Task> createTask(@RequestBody Task task) {
		 
		 Task task2=service.createTask(task);
		 
		 return new ResponseEntity<Task>(task2,HttpStatus.OK);
	 }
     
          @GetMapping("/MasaiTask/tasks")
		public ResponseEntity<List<Task>> getAllTask() throws TaskException{
			
			List<Task> list=service.getAllTask();
			return new ResponseEntity<List<Task>>(list,HttpStatus.OK);
		}
          
         @PutMapping("/MasaiTask/tasks/{tsakId}") 
	    public ResponseEntity<Task>  updateTask(@PathVariable("tsakId") Integer taskId,@RequestBody Task task) throws TaskException{
	    	 
			 Task task2=service.updateTask(taskId, task);
			 
			 return new ResponseEntity<Task>(task2,HttpStatus.OK);
	    	
	    }
         
         @DeleteMapping("/MasaiTask/tasks/{tsakId}") 
	    public ResponseEntity<Task>  deleteTask(@PathVariable("tsakId") Integer taskId)throws TaskException{
	    	 
			 Task task2=service.deleteTask(taskId);
			 
			 return new ResponseEntity<Task>(task2,HttpStatus.OK);    	
	    	
	    }
	

}

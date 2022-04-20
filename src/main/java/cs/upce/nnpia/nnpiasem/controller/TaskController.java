package cs.upce.nnpia.nnpiasem.controller;

import cs.upce.nnpia.nnpiasem.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public void getTasks(){

    }

    @GetMapping("/{id}")
    public void getTask(@PathVariable Integer id){

    }

    @PostMapping("/add")
    public void addTask(){

    }

    @PutMapping("/update/{id}")
    public void updateTask(@PathVariable Integer id){

    }

    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable Integer id){

    }
}

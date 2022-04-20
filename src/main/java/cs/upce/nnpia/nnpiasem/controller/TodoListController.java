package cs.upce.nnpia.nnpiasem.controller;

import cs.upce.nnpia.nnpiasem.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/todoList")
public class TodoListController {

    @Autowired
    private TodoListService todoListService;

    @GetMapping("/")
    public void getTodoLists(){

    }

    @GetMapping("/{id}")
    public void getTodoList(@PathVariable Integer id){

    }

    @PostMapping("/add")
    public void addTodoList(){

    }

    @PutMapping("/update/{id}")
    public void updateTodoList(@PathVariable Integer id){

    }

    @DeleteMapping("/delete/{id}")
    public void deleteTodoList(@PathVariable Integer id){

    }
}

package cs.upce.nnpia.nnpiasem.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import cs.upce.nnpia.nnpiasem.entity.TodoList;
import cs.upce.nnpia.nnpiasem.repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoListService {

    @Autowired
    private TodoListRepository todoListRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public void delete(Integer id){
        TodoList todoList = todoListRepository.getById(id);
        todoListRepository.delete(todoList);
    }
}

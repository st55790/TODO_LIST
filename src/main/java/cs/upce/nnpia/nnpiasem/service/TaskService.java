package cs.upce.nnpia.nnpiasem.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import cs.upce.nnpia.nnpiasem.entity.Task;
import cs.upce.nnpia.nnpiasem.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public void delete(Integer id){
        Task task = taskRepository.getById(id);
        taskRepository.delete(task);
    }
}

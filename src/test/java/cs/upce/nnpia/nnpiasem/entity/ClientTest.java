package cs.upce.nnpia.nnpiasem.entity;

import cs.upce.nnpia.nnpiasem.repository.TaskRepository;
import cs.upce.nnpia.nnpiasem.repository.TeamRepository;
import cs.upce.nnpia.nnpiasem.repository.TodoListRepository;
import cs.upce.nnpia.nnpiasem.repository.ClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;

@SpringBootTest
class ClientTest {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private TodoListRepository todoListRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TeamRepository teamRepository;

/*
    @Test
    void createUser() {
        Client client = new Client("Admin", "Admin", "Admin", "Admin123", "admin@email.com");
        clientRepository.save(client);
    }

    @Test
    void createUserWithTodoList(){
        Client client = new Client("Admin", "Admin", "Admin", "Admin123", "admin@email.com");
        clientRepository.save(client);

        TodoList todoList = new TodoList("Admin TODO List", client);
        todoListRepository.save(todoList);


    }

    @Test
    void createUserWithTask(){
        Client client = new Client("Admin", "Admin", "Admin", "Admin123", "admin@email.com");
        clientRepository.save(client);

        TodoList todoList = new TodoList("Admin TODO List", client);
        todoListRepository.save(todoList);

        Task task = new Task("Novy task", 1, LocalDate.now(), LocalDate.of(2022,7,3), todoList);
        taskRepository.save(task);
    }*/

    @Test
    void createUserWithTeam(){

        Client client = new Client("Admin", "Admin", "Admin", "Admin123", "admin@email.com");
        clientRepository.save(client);

        TodoList todoList = new TodoList("Admin TODO List", client);
        todoListRepository.save(todoList);

        Task task = new Task("Novy task", 1, LocalDate.now(), LocalDate.of(2022,7,3), todoList);
        taskRepository.save(task);

        Team team = new Team("AdminTeam", client);
        teamRepository.saveAndFlush(team);

    }
}

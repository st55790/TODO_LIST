package cs.upce.nnpia.nnpiasem.repository;

import cs.upce.nnpia.nnpiasem.entity.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoList, Integer> {
}

package cs.upce.nnpia.nnpiasem.repository;

import cs.upce.nnpia.nnpiasem.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}

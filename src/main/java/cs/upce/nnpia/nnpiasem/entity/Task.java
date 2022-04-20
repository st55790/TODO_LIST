package cs.upce.nnpia.nnpiasem.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import javax.validation.constraints.*;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Column(length = 1024)
    private String description;

    @Min(1)
    @Max(5)
    @NotNull
    private Integer priority;

    @NotNull
    private LocalDate startDate;

    @NotNull
    @FutureOrPresent
    private LocalDate deadline;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    private TodoList todoList;

    public Task() {
    }

    public Task(String description, Integer priority, LocalDate startDate, LocalDate deadline, TodoList todoList) {
        this.description = description;
        this.priority = priority;
        this.startDate = startDate;
        this.deadline = deadline;
        this.todoList = todoList;
    }
}

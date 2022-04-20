package cs.upce.nnpia.nnpiasem.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
public class TodoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String name;

    @OneToMany(orphanRemoval = true, mappedBy = "todoList")
    private List<Task> tasks;
    @ManyToOne()
    private Client clientOwner;
    @ManyToOne
    private Team teamOwner;

    public TodoList() {
    }

    public TodoList(String name, Client clientOwner) {
        this.name = name;
        this.clientOwner = clientOwner;
    }
}

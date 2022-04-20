package cs.upce.nnpia.nnpiasem.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    private String nameOfTeam;

    @NotNull
    @ManyToOne
    private Client teamOwner;

    //@ManyToMany(mappedBy = "inTeams", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    //private List<Client> listOfClients;

    @OneToMany(orphanRemoval = true, mappedBy = "teamOwner")
    private List<TodoList> todoLists;

    public Team() {
    }

    public Team(String nameOfTeam, Client teamOwner) {
        this.nameOfTeam = nameOfTeam;
        this.teamOwner = teamOwner;
    }
}

package cs.upce.nnpia.nnpiasem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import javax.validation.constraints.*;


@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String secondName;

    @NotBlank
    private String username;

    @NotNull
    @Size(min = 8, max = 255)
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,64}$")
    private String password;

    @NotNull
    @Email
    private String email;

    @OneToMany(orphanRemoval = true, mappedBy = "clientOwner")
    private List<TodoList> todoLists;

    @ManyToMany
    @JoinTable(
            name = "client_teams",
            joinColumns = @JoinColumn(name = "team_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name = "client_list_id", referencedColumnName="id")
    )
    private List<Team> inTeams;

    @OneToMany(orphanRemoval = true, mappedBy = "teamOwner")
    private List<Team> createdTeams;

    public Client() {
    }

    public Client(String firstName, String secondName, String username, String password, String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}

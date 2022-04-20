package cs.upce.nnpia.nnpiasem.controller;

import cs.upce.nnpia.nnpiasem.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/")
    public void getTeams(){

    }

    @GetMapping("/{id}")
    public void getTeam(@PathVariable Integer id){

    }

    @PostMapping("/add")
    public void addTeam(){

    }

    @PutMapping("/update/{id}")
    public void updateTeam(@PathVariable Integer id){

    }

    @DeleteMapping("/delete/{id}")
    public void deleteTeam(@PathVariable Integer id){

    }
}

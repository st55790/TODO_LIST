package cs.upce.nnpia.nnpiasem.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import cs.upce.nnpia.nnpiasem.entity.Team;
import cs.upce.nnpia.nnpiasem.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public void delete(Integer id){
        Team team = teamRepository.getById(id);
        teamRepository.delete(team);
    }
}

package cs.upce.nnpia.nnpiasem.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import cs.upce.nnpia.nnpiasem.entity.Client;
import cs.upce.nnpia.nnpiasem.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public void delete(Integer id){
        Client client = clientRepository.getById(id);
        clientRepository.delete(client);
    }
}

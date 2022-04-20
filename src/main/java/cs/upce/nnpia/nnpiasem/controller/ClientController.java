package cs.upce.nnpia.nnpiasem.controller;

import cs.upce.nnpia.nnpiasem.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public void getUsers(){

    }

    @GetMapping("/{id}")
    public void getUser(@PathVariable Integer id){

    }

    @PostMapping("/add")
    public void addUser(){

    }

    @PutMapping("/update/{id}")
    public void updateUser(@PathVariable Integer id){

    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Integer id){

    }
}

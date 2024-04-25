package com.example.dsclient.resources;


import com.example.dsclient.dto.ClientDTO;
import com.example.dsclient.entities.Client;
import com.example.dsclient.repository.ClientRepository;
import com.example.dsclient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientResources {

    @Autowired
    private ClientService service;

    @GetMapping
    public ResponseEntity<List<ClientDTO>> all(){

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id){

        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<ClientDTO> create(@RequestBody ClientDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClientDTO> update(@PathVariable Long id, @RequestBody ClientDTO dto){
        return ResponseEntity.ok().body(service.update(dto,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}

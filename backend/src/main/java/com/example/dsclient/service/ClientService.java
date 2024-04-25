package com.example.dsclient.service;


import com.example.dsclient.dto.ClientDTO;
import com.example.dsclient.entities.Client;
import com.example.dsclient.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public List<ClientDTO> findAll() {
        List<ClientDTO> clientDTO = new ArrayList<>();
        List<Client> entity = repository.findAll();
        for (Client client : entity) {
            clientDTO.add(new ClientDTO(client));
        }
        return clientDTO;
    }

    public ClientDTO findById(Long id) {
        Client entity = repository.findById(id).get();
        ClientDTO entityDTO = new ClientDTO(entity);
        return entityDTO;
    }

    public ClientDTO save(ClientDTO clientDTO) {
        Client entity = new Client();
        copyDtoToEntity(clientDTO,entity);
        entity = repository.save(entity);
        return new ClientDTO(entity);
    }

    private void copyDtoToEntity(ClientDTO dto, Client entity) {
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setBirth_Date(dto.getBirth_Date());
        entity.setChildren(dto.getChildren());
        entity.setIncome(dto.getIncome());
    }
}

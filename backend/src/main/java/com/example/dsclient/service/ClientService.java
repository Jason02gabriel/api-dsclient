package com.example.dsclient.service;


import com.example.dsclient.dto.ClientDTO;
import com.example.dsclient.entities.Client;
import com.example.dsclient.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(PageRequest pageRequest) {
        Page<Client> clients = repository.findAll(pageRequest);
        return clients.map(client -> new ClientDTO(client));
    }

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client entity = repository.findById(id).get();
        ClientDTO entityDTO = new ClientDTO(entity);
        return entityDTO;
    }

    @Transactional
    public ClientDTO save(ClientDTO clientDTO) {
        Client entity = new Client();
        copyDtoToEntity(clientDTO,entity);
        entity = repository.save(entity);
        return new ClientDTO(entity);
    }

    @Transactional
    public ClientDTO update(ClientDTO clientDTO, Long id) {
        Client entity = repository.findById(id).get();
        copyDtoToEntity(clientDTO,entity);
        entity = repository.save(entity);
        return new ClientDTO(entity);
    }

    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

    private void copyDtoToEntity(ClientDTO dto, Client entity) {
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setBirth_Date(dto.getBirth_Date());
        entity.setChildren(dto.getChildren());
        entity.setIncome(dto.getIncome());
    }
}

package com.example.reto3ciclo3.Repository;


import com.example.reto3ciclo3.Modelo.Client;
import com.example.reto3ciclo3.Repository.CrudRepository.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository ;
    public List<Client> getAll(){
        return (List<Client>)clientCrudRepository.findAll();
    }

    public Optional<Client> getClient(Object object){
        return clientCrudRepository.findById((Integer) object);
    }

    public Client save(Client client){
        return clientCrudRepository.save(client);
    }

    public void delete (Client client){
        clientCrudRepository.delete(client);
    }
}


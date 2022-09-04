package com.leodemetrio.hellobanck.service;

import com.leodemetrio.hellobanck.dto.ClientDto;
import com.leodemetrio.hellobanck.model.Client;

import java.util.List;
import java.util.UUID;

public interface IClientService {
    Client findById(UUID uuid);
    List<Client> findAll();
    Client create(ClientDto clientDto);
    Client update(UUID uuid, ClientDto clientDto);
    void delete(UUID uuid);
}

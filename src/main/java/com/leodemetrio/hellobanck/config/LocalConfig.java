package com.leodemetrio.hellobanck.config;

import com.leodemetrio.hellobanck.model.Client;
import com.leodemetrio.hellobanck.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private ClientRepository clientRepository;

    @Bean
    public void seederDB(){
        clientRepository.deleteAll();
        Client c = new Client(null, "Leo1", "123");
        Client c1 = new Client(null, "Leo3", "123");

        clientRepository.saveAll(List.of(c,c1));
    }
}

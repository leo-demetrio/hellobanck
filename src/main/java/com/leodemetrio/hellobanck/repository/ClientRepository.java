package com.leodemetrio.hellobanck.repository;

import com.leodemetrio.hellobanck.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
}

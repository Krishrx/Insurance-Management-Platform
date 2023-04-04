package com.krishrx.imp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishrx.imp.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}

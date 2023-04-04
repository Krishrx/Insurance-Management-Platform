package com.krishrx.imp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishrx.imp.models.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long> {

}

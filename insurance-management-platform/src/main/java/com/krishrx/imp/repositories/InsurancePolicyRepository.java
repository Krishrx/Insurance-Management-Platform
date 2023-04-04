package com.krishrx.imp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishrx.imp.models.InsurancePolicy;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Long> {

}

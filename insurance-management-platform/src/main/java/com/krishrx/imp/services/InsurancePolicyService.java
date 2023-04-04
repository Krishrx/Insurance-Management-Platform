package com.krishrx.imp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.krishrx.imp.models.InsurancePolicy;
import com.krishrx.imp.repositories.InsurancePolicyRepository;

@Service
public class InsurancePolicyService {
	
	@Autowired
	private InsurancePolicyRepository insurancePolicyRepository;
	
	public List<InsurancePolicy>getAllInsurancePolicies(){
		ArrayList<InsurancePolicy>policies = new ArrayList<InsurancePolicy>();
		insurancePolicyRepository.findAll().forEach(policy ->policies.add(policy));
		return policies;
	}
	
	public InsurancePolicy getInsurancePolicyById(long id) {
		return insurancePolicyRepository.findById(id).get();
	}
	
	public void save(InsurancePolicy policy) {
		insurancePolicyRepository.save(policy);
	}
	
	public void delete(long id) {
		insurancePolicyRepository.deleteById(id);
	}
	
	public boolean update(long id,InsurancePolicy policy) {
		InsurancePolicy existingPolicy = insurancePolicyRepository.findById(id).orElse(null);
		if(existingPolicy!=null) {
			existingPolicy.setPolicyId(policy.getPolicyId());
			existingPolicy.setPolicyNumber(policy.getPolicyNumber());
			existingPolicy.setType(policy.getType());
			existingPolicy.setCoverageAmount(policy.getCoverageAmount());
			existingPolicy.setPremium(policy.getPremium());
			existingPolicy.setStartDate(policy.getStartDate());
			existingPolicy.setEndDate(policy.getEndDate());
			insurancePolicyRepository.save(existingPolicy);
			return true;
		}
		return false;
	}
}

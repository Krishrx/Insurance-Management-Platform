package com.krishrx.imp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.krishrx.imp.models.InsurancePolicy;
import com.krishrx.imp.services.InsurancePolicyService;

@RestController
public class InsurancePolicyController {

	@Autowired
	private InsurancePolicyService insurancePolicyService;
	
	@GetMapping("get/api/policies")
	private List<InsurancePolicy> getAllPoliciess(){
		return insurancePolicyService.getAllInsurancePolicies();
	}
	
	@GetMapping("get/api/policies/{id}")
	private InsurancePolicy getPolicyById(@PathVariable("id") long id) {
		return insurancePolicyService.getInsurancePolicyById(id);
	}
	
	@DeleteMapping("delete/api/policies/{id}")
	private String deletePolicy(@PathVariable("id") long id) {
		insurancePolicyService.delete(id);
		return "Successfully Deleted:"+id;
	}
	
	@PostMapping("post/api/policies")  
	private String savePolicy(@RequestBody InsurancePolicy policy) {  
		insurancePolicyService.save(policy);
		return "Successfully Created:"+policy.getPolicyId();
	}  
  
	@PutMapping("put/api/policies/{id}")  
	private String update(@PathVariable("id") long id,@RequestBody InsurancePolicy policy) { 
		boolean check = insurancePolicyService.update(id,policy);  
		if(check) {
			return "Updated Successfully";
		}
		return "Invalid id";
	} 
}

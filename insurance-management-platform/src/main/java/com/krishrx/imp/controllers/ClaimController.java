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

import com.krishrx.imp.models.Claim;
import com.krishrx.imp.services.ClaimService;

@RestController
public class ClaimController {

	@Autowired
	private ClaimService claimService;
	
	@GetMapping("get/api/claims")
	private List<Claim> getAllClaims(){
		return claimService.getAllClaims();
	}
	
	@GetMapping("get/api/claims/{id}")
	private Claim getClientById(@PathVariable("id") long id) {
		return claimService.getClaimById(id);
	}
	
	@DeleteMapping("delete/api/claims/{id}")
	private String deleteClient(@PathVariable("id") long id) {
		claimService.delete(id);
		return "Successfully Deleted:"+id;
	}
	
	@PostMapping("post/api/claims")  
	private String saveClient(@RequestBody Claim claim) {  
		claimService.save(claim);
		return "Successfully Created:"+claim.getClaimId();
	}  
  
	@PutMapping("put/api/claims/{id}")  
	private String update(@PathVariable("id") long id,@RequestBody Claim claim) { 
		boolean check = claimService.update(id,claim);  
		if(check) {
			return "Updated Successfully";
		}
		return "Invalid id";
	} 
}

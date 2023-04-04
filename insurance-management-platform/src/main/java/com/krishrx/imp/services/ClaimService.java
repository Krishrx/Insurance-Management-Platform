package com.krishrx.imp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishrx.imp.models.Claim;
import com.krishrx.imp.repositories.ClaimRepository;

@Service
public class ClaimService {
	
	@Autowired
	private ClaimRepository claimRepository;
	
	public List<Claim>getAllClaims(){
		ArrayList<Claim>claims = new ArrayList<Claim>();
		claimRepository.findAll().forEach(claim ->claims.add(claim));
		return claims;
	}
	
	public Claim getClaimById(long id) {
		return claimRepository.findById(id).get();
	}
	
	public void save(Claim claim) {
		claimRepository.save(claim);
	}
	
	public void delete(long id) {
		claimRepository.deleteById(id);
	}
	
	public boolean update(long id,Claim claim) {
		Claim existingClaim = claimRepository.findById(id).orElse(null);
		if(existingClaim!=null) {
			existingClaim.setClaimId(claim.getClaimId());
			existingClaim.setClaimNumber(claim.getClaimNumber());
			existingClaim.setClaimDate(claim.getClaimDate());
			existingClaim.setDescription(claim.getDescription());
			existingClaim.setClaimStatus(claim.getClaimStatus());
			claimRepository.save(existingClaim);
			return true;
		}
		return false;
	}
	
	
}

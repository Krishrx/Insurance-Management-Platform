package com.krishrx.imp.dto;

import java.time.LocalDate;

public class ClaimDto {

	private Long claimId;

    private String claimNumber;

    private String description;

    private LocalDate claimDate;

    private String claimStatus;

	public ClaimDto() {
		
	}

	public ClaimDto(Long claimId, String claimNumber, String description, LocalDate claimDate, String claimStatus) {
		super();
		this.claimId = claimId;
		this.claimNumber = claimNumber;
		this.description = description;
		this.claimDate = claimDate;
		this.claimStatus = claimStatus;
	}

	public Long getClaimId() {
		return claimId;
	}

	public void setClaimId(Long claimId) {
		this.claimId = claimId;
	}

	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(LocalDate claimDate) {
		this.claimDate = claimDate;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	
	
    
    
}

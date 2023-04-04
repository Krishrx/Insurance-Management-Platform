package com.krishrx.imp.dto;

import java.time.LocalDate;
import java.util.List;

public class ClientDto {
	
	private String name;

    private LocalDate dateOfBirth;

    private String address;

    private String contactInformation;
    
    private List<InsurancePolicyDto> insurancePolicies;

	public ClientDto() {
		
	}

	public ClientDto(String name, LocalDate dateOfBirth, String address, String contactInformation,
			List<InsurancePolicyDto> insurancePolicies) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.contactInformation = contactInformation;
		this.insurancePolicies = insurancePolicies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public List<InsurancePolicyDto> getInsurancePolicies() {
		return insurancePolicies;
	}

	public void setInsurancePolicies(List<InsurancePolicyDto> insurancePolicies) {
		this.insurancePolicies = insurancePolicies;
	}
	
	
    
    
}

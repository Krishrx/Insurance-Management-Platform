package com.krishrx.imp.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String name;

    private LocalDate dateOfBirth;

    private String address;

    private String contactInformation;

    
	public Client(Long clientId, String name, LocalDate dateOfBirth, String address, String contactInformation) {
		super();
		this.clientId = clientId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.contactInformation = contactInformation;
	}

	public Client() {
		
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long id) {
		this.clientId = id;
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
    
}
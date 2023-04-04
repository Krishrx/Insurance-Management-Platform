package com.krishrx.imp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.krishrx.imp.dto.ClientDto;
import com.krishrx.imp.dto.InsurancePolicyDto;
import com.krishrx.imp.models.Client;
import com.krishrx.imp.models.InsurancePolicy;
import com.krishrx.imp.services.ClientService;

@RestController
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping("get/api/clients")
	private List<Client> getAllClients(){
		return clientService.getAllClients();
	}
	
	@GetMapping("get/api/clients/{id}")
	private Client getClientById(@PathVariable("id") long id) {
		return clientService.getClientById(id);
	}
	
	@DeleteMapping("delete/api/clients/{id}")
	private String deleteClient(@PathVariable("id") long id) {
		clientService.delete(id);
		return "Successfully Deleted:"+id;
	}
	
	@PostMapping("post/api/clients")  
	private String saveClient(@RequestBody Client client) {  
		clientService.save(client);
		return "Successfully Created:"+client.getClientId();
	}  
  
	@PutMapping("put/api/clients/{id}")  
	private String update(@PathVariable("id") long id,@RequestBody Client client) { 
		boolean check = clientService.update(id,client);  
		if(check) {
			return "Updated Successfully";
		}
		return "Invalid id";
	} 
}

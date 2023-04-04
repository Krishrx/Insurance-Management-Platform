package com.krishrx.imp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishrx.imp.models.Client;
import com.krishrx.imp.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client>getAllClients(){
		ArrayList<Client>clients = new ArrayList<Client>();
		clientRepository.findAll().forEach(client ->clients.add(client));
		return clients;
	}
	
	public Client getClientById(long id) {
		return clientRepository.findById(id).get();
	}
	
	public Client save(Client client) {
		return clientRepository.save(client);
	}
	
	public void delete(long id) {
		clientRepository.deleteById(id);
	}
	
	public boolean update(long id,Client client) {
		Client existingClient = clientRepository.findById(id).orElse(null);
		if(existingClient!=null) {
			existingClient.setClientId(id);
			existingClient.setName(client.getName());
			existingClient.setDateOfBirth(client.getDateOfBirth());
			existingClient.setContactInformation(client.getContactInformation());
			existingClient.setAddress(client.getAddress());
			clientRepository.save(existingClient);
			return true;
		}
		return false;
	}
}

package org.formation.proxibanqueV3.service;

import java.util.List;

import org.formation.proxibanqueV3.entity.Client;
import org.formation.proxibanqueV3.persistance.DaoClient;
import org.formation.proxibanqueV3.persistance.IDaoCrud;


// TODO: Auto-generated Javadoc
/**
 *  @author HLMF
 * The Class ClientService.
 * elle permet de communiquer avec le DAO afin d'effectuer le CRUD sur les donnees Client
 * elle permet aussi de lister tous les clients
 */
public class ClientService extends serviceCommon{
	
	/** The client service. */
	private IDaoCrud<Client> clientService;

	/**
	 * Instantiates a new client service.
	 */
	public ClientService() {

		this.clientService = DaoClient.getInstance();
	}
	
	/**
	 * Adds the client.
	 *
	 * @param c the c
	 */
	public void addClient(Client c) {
		getEntityTransaction().begin();
		clientService.create(c, getEntityManager());
		getEntityTransaction().commit();
	}

	/**
	 * Gets the client.
	 *
	 * @param idClient the id client
	 * @return the client
	 */
	public Client getClient(long idClient) {
		getEntityTransaction().begin();
		Client client = clientService.read(idClient, getEntityManager());
		getEntityTransaction().commit();
		return client ;
	}

	/**
	 * Delete client.
	 *
	 * @param c the c
	 */
	public void deleteClient(Client c) {
		getEntityTransaction().begin();
		clientService.delete(c, getEntityManager());
		getEntityTransaction().commit();
	}

	/**
	 * Replace client.
	 *
	 * @param client the client
	 */
	public void replaceClient(Client client) {
		getEntityTransaction().begin();
		clientService.update(client, getEntityManager());
		getEntityTransaction().commit();
	}

	/**
	 * Show all clients.
	 *
	 * @return the list
	 */
	public List<Client> showAllClients() {
		
		return clientService.showAll(getEntityManager());
		
	}

	
}

package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Client;

import java.util.List;

public interface IClientService {
    Client ajouterClient(Client client);
    Client modifierClient(Client client);
    Client afficherClientById(Long id);
    List<Client> afficherAllClient();
    void supprimerClient(Long id);
}


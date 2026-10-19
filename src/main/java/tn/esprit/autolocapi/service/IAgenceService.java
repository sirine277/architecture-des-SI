package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Agence;


import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence agence);
    Agence modifierAgence(Agence agence);
    Agence afficherAgenceById(Long id);
    List<Agence> afficherAllAgence();
    void supprimerAgence(Long id);
}

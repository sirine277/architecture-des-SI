package tn.esprit.autolocapi.service;
import tn.esprit.autolocapi.domain.Contrat;

import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);
    Contrat modifierContrat(Contrat contrat);
    Contrat afficherContratById(Long id);
    List<Contrat> afficherAllContrat();
    void supprimerContrat(Long id);
}

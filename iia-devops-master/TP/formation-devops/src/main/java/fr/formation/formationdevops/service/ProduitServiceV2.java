package fr.formation.formationdevops.service;

import org.springframework.stereotype.Service;

@Service
public class ProduitServiceV2 extends ProduitService {
    @Override
    public void findAll() {
        System.out.println("Recherche en base de données ...");
    }
}

package fr.formation.formationdevops.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.formationdevops.model.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Integer> {
    
}

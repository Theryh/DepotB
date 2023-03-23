package fr.formation.formationdevops.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.formationdevops.model.Produit;
import fr.formation.formationdevops.repo.IProduitRepository;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {
    @Autowired
    private IProduitRepository repoProduit;

    @GetMapping
    public List<Produit> findAll() {
        return this.repoProduit.findAll();
    }

    @GetMapping("/generer")
    public boolean generate() {
        Produit produit = new Produit();

        produit.setNom("DevOps");
        produit.setPrix(50);

        this.repoProduit.save(produit);

        return true;
    }
}

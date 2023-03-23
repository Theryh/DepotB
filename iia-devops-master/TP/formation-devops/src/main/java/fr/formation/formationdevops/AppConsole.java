package fr.formation.formationdevops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.formation.formationdevops.service.ProduitService;

@Component
public class AppConsole implements CommandLineRunner {
    @Autowired // Injection de dépendance
    private ProduitService srvProduit;
    
    @Override
    public void run(String... args) throws Exception {
        // ICI LE CODE DU PROGRAMME PRINCIPAL
        
        this.srvProduit.findAll();
        this.srvProduit.save();
        
    }
}

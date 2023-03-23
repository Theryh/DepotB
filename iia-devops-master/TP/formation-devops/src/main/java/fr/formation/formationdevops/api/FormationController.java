package fr.formation.formationdevops.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/formation")
public class FormationController {
    @GetMapping
    public String formation() {
        return "Formation DevOps!";
    }
}

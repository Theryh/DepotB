package fr.formation.formationdevops.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class ProduitControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldFindAllStatusOk() throws Exception {
        this.mockMvc
            .perform(MockMvcRequestBuilders.get("/api/produit"))
            .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void shouldGenerateStatusOk() throws Exception {
        this.mockMvc
            .perform(MockMvcRequestBuilders.get("/api/produit/generer"))
            .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
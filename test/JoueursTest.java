package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.Joueurs;
import java.util.List;

public class JoueursTest {
    private Joueurs combattant;

    @BeforeEach
    void setUp() {
        combattant = new Joueurs("001", "Doe", "John", "JohnFighter", 80.5);
    }

    @Test
    void testAjouterVictoire() {
        combattant.ajouterVictoire();
        assertEquals(1, combattant.getVictoires());
    }

    @Test
    void testAjouterDefaite() {
        combattant.ajouterDefaite();
        assertEquals(1, combattant.getDefaites());
    }

    @Test
    void testAjouterEgalite() {
        combattant.ajouterEgalite();
        assertEquals(1, combattant.getEgalites());
    }

    @Test
    void testAjouterTitre() {
        String titre = "Titre de champion";
        combattant.ajouterTitre(titre);
        List<String> titres = combattant.getTitres();
        assertNotNull(titres);
        assertEquals(1, titres.size());
        assertTrue(titres.contains(titre));
    }

    @Test
    void testGetVictoires() {
        combattant.ajouterVictoire();
        assertEquals(1, combattant.getVictoires());
    }

    @Test
    void testGetTitresVide() {
        List<String> titres = combattant.getTitres();
        assertNotNull(titres);
        assertTrue(titres.isEmpty());
    }

    @Test
    void testAjouterPlusieursTitres() {
        combattant.ajouterTitre("Titre 1");
        combattant.ajouterTitre("Titre 2");
        List<String> titres = combattant.getTitres();
        assertEquals(2, titres.size());
        assertTrue(titres.contains("Titre 1"));
        assertTrue(titres.contains("Titre 2"));
    }
}
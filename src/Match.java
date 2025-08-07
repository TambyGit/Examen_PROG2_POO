package src;

import java.time.LocalDate;

public class Match {
    private int id;
    private LocalDate date;
    private String endroit;
    private TypeMatch type; 
    private Joueurs combattant1; 
    private Joueurs combattant2;

    public Match(int id, LocalDate date, String endroit, TypeMatch type, Joueurs combattant1, Joueurs combattant2) {
        this.id = id;
        this.date = date;
        this.endroit = endroit;
        this.type = type;
        this.combattant1 = combattant1;
        this.combattant2 = combattant2;
    }
    
    public Joueurs getCombattant1() {
         return combattant1; 
    }

    public Joueurs getCombattant2() { 
        return combattant2; 
    }

    public TypeMatch getType() { 
        return type; 
    }
 
    public void finish(Joueurs gagnant) {
        if (type == TypeMatch.POUR_TITRE && gagnant != null) {
            gagnant.ajouterTitre("Titre de champion"); 
        }

        if (type == TypeMatch.OFFICIEL || type == TypeMatch.POUR_TITRE) {
            if (gagnant != null) {
                if (gagnant.equals(combattant1)) {
                    combattant1.ajouterVictoire();
                    combattant2.ajouterDefaite();
                } else {
                    combattant1.ajouterDefaite();
                    combattant2.ajouterVictoire();
                }
            } else {
                combattant1.ajouterEgalite();
                combattant2.ajouterEgalite();
            }
        }
    }

}

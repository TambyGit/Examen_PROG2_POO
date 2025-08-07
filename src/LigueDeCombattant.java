package src;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class LigueDeCombattant {
    private String nom;
    private List<Joueurs> combattants;
    private List<match> matchs;

    public LigueDeCombattant(String nom) {
        this.nom = nom;
        this.combattants = new ArrayList<>();
        this.matchs = new ArrayList<>();
    }

    public void CreerMatch(int id, LocalDate date, String endroit, TypeMatch type, Joueurs combattant1, Joueurs combattant2) {
        match nouveauMatch = new match(id, date, endroit, type, combattant1, combattant2);
        this.matchs.add(nouveauMatch);
    }

    public List<match> getMatchsByFighter(Joueurs combattant) {
        List<match> result = new ArrayList<>();
        for (match m : this.matchs) {
            if (m.getCombattant1().equals(combattant) || m.getCombattant2().equals(combattant)) {
                result.add(m);
            }
        }
        return result;
    }
}
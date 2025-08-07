package src;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class LigueDeCombattant {
    private String nom;
    private List<Joueurs> combattants;
    private List<Match> matchs;

    public LigueDeCombattant(String nom) {
        this.nom = nom;
        this.combattants = new ArrayList<>();
        this.matchs = new ArrayList<>();
    }

    public void CreerMatch(int id, LocalDate date, String endroit, TypeMatch type, Joueurs combattant1, Joueurs combattant2) {
        Match nouveauMatch = new Match(id, date, endroit, type, combattant1, combattant2);
        this.matchs.add(nouveauMatch);
    }

    public List<Match> getMatchsByFighter(Joueurs combattant) {
        List<Match> result = new ArrayList<>();
        for (Match m : this.matchs) {
            if (m.getCombattant1().equals(combattant) || m.getCombattant2().equals(combattant)) {
                result.add(m);
            }
        }
        return result;
    }
}
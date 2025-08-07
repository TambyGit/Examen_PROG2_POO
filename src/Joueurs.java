package src;
import java.util.List;
import java.util.ArrayList;

public class Joueurs {
    private String id;
    private String nom;
    private String prenom;
    private String NomDeCombattant;
    private double Poids;
    private List<String> titres; 
    private int victoires;      
    private int defaites;       
    private int egalites;       

    
    public Joueurs(String id, String nom, String prenom, String nomDeCombattant, double poids) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.NomDeCombattant = nomDeCombattant;
        this.Poids = poids;
        this.titres = new ArrayList<>(); 
        this.victoires = 0;
        this.defaites = 0;
        this.egalites = 0;
    }

    
    public List<String> getTitres() {
        return titres;
    }

    public int getVictoires() {
        return victoires;
    }

    public int getDefaites() {
        return defaites;
    }

    public int getEgalites() {
        return egalites;
    }
   
    public void ajouterVictoire() {
        this.victoires++;
    }

    public void ajouterDefaite() {
        this.defaites++;
    }

    public void ajouterEgalite() {
        this.egalites++;
    }

    public void ajouterTitre(String titre) {
        this.titres.add(titre);
    }
}
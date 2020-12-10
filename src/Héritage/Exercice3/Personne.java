package Héritage.Exercice3;

public class Personne {
    private String nom;
    private String prenom;
    private int dateDeNaissance;
    private String adresse;
    private String ville;


//Constructor
    public Personne(String nom, String prenom, int dateDeNaissance, String adresse, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.ville = ville;
    }

//Getters


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }

//Setters
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

//Method toString


    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }

    //Method modifiePersonne
    public void modifiePersonne(String adresse, String ville){
        setAdresse(adresse);
        setVille(ville);
        System.out.println();
    }

//Method ecrirePersonne
    public String ecrirePersonne(){
        return toString();
    }

}

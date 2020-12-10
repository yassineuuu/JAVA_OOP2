package Héritage.Exercice3;

public class Enseignant extends Personne{

    private String specialite;


//Constructor
    public Enseignant(String nom, String prenom, int dateDeNaissance, String adresse, String ville, String specialite) {
        super(nom, prenom, dateDeNaissance, adresse, ville);
        this.specialite = specialite;
    }

//Method toString

    @Override
    public String toString() {
        return super.toString() + '\'' + "Enseignant{" +
                "spécialité='" + specialite + '\'' +
                '}';
    }
}

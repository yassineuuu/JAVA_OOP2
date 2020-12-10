package Héritage.Exercice3;

public class Etudiant extends Personne{

    private String diplome;

//Constructor
    public Etudiant(String nom, String prenom, int dateDeNaissance, String adresse, String ville, String diplome) {
        super(nom, prenom, dateDeNaissance, adresse, ville);
        this.diplome = diplome;
    }

//Method toString

    @Override
    public String toString() {
        return super.toString() + '\'' + "Etudiant{" +
                "diplome='" + diplome + '\'' +
                '}';
    }
}

package Héritage.Exercice3;

public class Etudiant extends Personne{

    private String diplome;
    private static int count = 0;

//Constructor
    public Etudiant(String nom, String prenom, int dateDeNaissance, String adresse, String ville, String diplome) {
        super(nom, prenom, dateDeNaissance, adresse, ville);
        this.diplome = diplome;
        count++;
    }

//Getter
    public static int getCount() {
        return count;
    }
    //Method toString

    @Override
    public String toString() {
        return super.toString() + '\'' + "Etudiant{" +
                "diplome='" + diplome + '\'' +
                '}';
    }

//Abstract Method
    @Override
    public void ecrirePersonne() {

    }
}

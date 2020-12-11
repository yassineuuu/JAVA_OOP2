package Héritage.Exercice3;

public class Enseignant extends Personne{

    private String specialite;
    private static int count = 0;


//Constructor
    public Enseignant(String nom, String prenom, int dateDeNaissance, String adresse, String ville, String specialite) {
        super(nom, prenom, dateDeNaissance, adresse, ville);
        this.specialite = specialite;
        count++;
    }
//Getter
    public static int getCount() {
        return count;
    }

//Method toString

    @Override
    public String toString() {
        return super.toString() + '\'' + "Enseignant{" +
                "spécialité='" + specialite + '\'' +
                '}';
    }

//Abstract Method
    @Override
    public void ecrirePersonne() {

    }
}

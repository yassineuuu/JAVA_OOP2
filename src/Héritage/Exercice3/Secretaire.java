package Héritage.Exercice3;

public class Secretaire extends Personne{

    private String numeroBureau;
    private static int count = 0;

//Constructor
    public Secretaire(String nom, String prenom, int dateDeNaissance, String adresse, String ville, String numeroBureau) {
        super(nom, prenom, dateDeNaissance, adresse, ville);
        this.numeroBureau=numeroBureau;
        count++;
    }

//Getter
    public static int getCount() {
        return count;
    }

    //Method toString

    @Override
    public String toString() {
        return super.toString() + '\'' + "Secretaire{" +
                "Num de Bureau='" + numeroBureau + '\'' +
                '}';
    }

//Abstract Method
    @Override
    public void ecrirePersonne() {

    }
}

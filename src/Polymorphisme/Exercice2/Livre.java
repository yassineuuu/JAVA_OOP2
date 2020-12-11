package Polymorphisme.Exercice2;

public class Livre extends Ouvrage{

    private String auteur;


//Constructor
    public Livre(String titre, int dateDeCréation, boolean indicateur, String auteur) {
        super(titre, dateDeCréation, indicateur);
        this.auteur = auteur;
    }

//Getters

    public String getAuteur() {
        return auteur;
    }

//Method afficher

    @Override
    public String afficher() {
        return super.afficher() + "Auteur: " + auteur;
    }
}

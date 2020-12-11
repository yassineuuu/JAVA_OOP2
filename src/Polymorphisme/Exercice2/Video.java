package Polymorphisme.Exercice2;

public class Video extends Ouvrage{

    private String editeur;
    private double duree;

//Costructor

    public Video(String titre, int dateDeCréation, boolean indicateur, String editeur, double duree) {
        super(titre, dateDeCréation, indicateur);
        this.editeur = editeur;
        this.duree = duree;
    }


//Getter

    public String getEditeur() {
        return editeur;
    }

//Method afficher

    @Override
    public String afficher() {
        return super.afficher() + "Duree: " + duree + ", " + "Editeur: " + editeur;
    }
}

package Polymorphisme.Exercice2;

public class Ouvrage {
    private String titre;
    private int dateDeCréation;
    private boolean indicateur;

//Constructor


    public Ouvrage(String titre, int dateDeCréation, boolean indicateur) {
        this.titre = titre;
        this.dateDeCréation = dateDeCréation;
        this.indicateur = indicateur;
    }


//Getter
    public String getTitre() {
        return titre;
    }

    public int getDateDeCréation() {
        return dateDeCréation;
    }

    public boolean isIndicateur() {
        return indicateur;
    }


//Method Afficher
    public String afficher() {
        return "Ouvrage{" +
                "titre='" + titre + '\'' +
                ", dateDeCréation=" + dateDeCréation +
                ", indicateur=" + indicateur +
                '}';
    }
}

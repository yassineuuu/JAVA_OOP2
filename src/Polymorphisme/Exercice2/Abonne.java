package Polymorphisme.Exercice2;

public class Abonne {
    private int id;
    private String nom;
    private int numAbonnement;
    private String ouvragePris;

//Constructor

    public Abonne(int id, String nom, int numAbonnement, String ouvragePris) {
        this.id = id;
        this.nom = nom;
        this.numAbonnement = numAbonnement;
        this.ouvragePris = ouvragePris;
    }


// Getters

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNumAbonnement() {
        return numAbonnement;
    }

    public String getOuvragePris() {
        return ouvragePris;
    }





}

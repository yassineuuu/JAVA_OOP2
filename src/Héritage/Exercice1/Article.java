package Héritage.Exercice1;

public class Article {
    private String nom;
    private int prix;

    public Article(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public int afficher(){
        return prix;
    }
}

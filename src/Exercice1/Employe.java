package Exercice1;

public class Employe {
    private String nom;
    private String prenom;
    private String adresse;
    private int annee = 2020;
    private int anneeDeNaissance;

    public Employe(String nom, String prenom, String adresse, int anneeDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.anneeDeNaissance = anneeDeNaissance;
    }
    public int calculerAge(){
        int age = annee - anneeDeNaissance;
        return age;
    }
    public void afficherInfosClient(){
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Adresse: " + adresse);
        System.out.println("Annee De Naissance: " + anneeDeNaissance);
        System.out.println("Age: " + calculerAge());

    }
}

package Polymorphisme.Exercice1;

public class Personne {
    private String nom;
    private String prenom;
    private String ville;
    private int dateDeNaissance;

//Constructor

    public Personne(String nom, String prenom, String ville, int dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.dateDeNaissance = dateDeNaissance;
    }

//Method Afficher
    public void Afficher(){
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Ville: " + ville);
        System.out.println("Date de naissance: " + dateDeNaissance);

    }

}

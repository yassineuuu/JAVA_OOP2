package Polymorphisme.Exercice1;

public class Employee extends Personne{

    int salaire;

//Constructor
    public Employee(String nom, String prenom, String ville, int dateDeNaissance, int salaire) {
        super(nom, prenom, ville, dateDeNaissance);
        this.salaire = salaire;
    }

//method Afficher
    @Override
    public void Afficher() {
        super.Afficher();
        System.out.println("Salaire: " + salaire + "DH");
    }
}

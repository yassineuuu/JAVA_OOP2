package Polymorphisme.Exercice1;

public class Chef extends Employee{

    String service;


//Constructor

    public Chef(String nom, String prenom, String ville, int dateDeNaissance, int salaire, String service) {
        super(nom, prenom, ville, dateDeNaissance, salaire);
        this.service = service;
    }


//Method afficher

    @Override
    public void Afficher() {
        super.Afficher();
        System.out.println("Service: " + service);
    }
}

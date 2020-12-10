package Héritage.Exercice2;

import java.util.Scanner;

public class CompteBancaire {

    private long numeroDuCompte;
    private double solde;


//Constructors
    public CompteBancaire(long numeroDuCompte, double solde) {
        this.numeroDuCompte = numeroDuCompte;
        this.solde = solde;
    }



// Setters
    public void setNumeroDuCompte(long numeroDuCompte) {
        this.numeroDuCompte = numeroDuCompte;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


//Getters
    public long getNumeroDuCompte() {
        return numeroDuCompte;
    }

    public double getSolde() {
        return solde;
    }


//Methode D'ajout
    public void ajouter(){
        Scanner ajout = new Scanner(System.in);
        System.out.println("Add to the Account: ");
        double enter = ajout.nextDouble();
        solde = solde + enter;
        //System.out.println("Your new Solde is: " + solde + "DH");

    }


//Methode Retirer
    public void retirer(){
        Scanner retire = new Scanner(System.in);
        System.out.println("How much you wanna get from the Account: ");
        double sorte = retire.nextDouble();
        if (sorte<=solde){
            solde = solde - sorte;
            //System.out.println("Your new Solde is: " + solde + "DH");
        }else {
            System.out.println("You don't posess that much of money!!!");
        }


    }


//Methode d'Affichage
    public void afficher(){
        System.out.println("##############################");
        System.out.println("Your new Solde is: " + solde + "DH");
        System.out.println("##############################");

    }
}

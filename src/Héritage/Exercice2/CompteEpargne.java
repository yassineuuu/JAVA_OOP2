package Héritage.Exercice2;

import java.util.Scanner;

public class CompteEpargne extends CompteBancaire{

    public CompteEpargne(long numeroDuCompte, double solde) {
        super(numeroDuCompte, solde);
        if (solde<200){
            setSolde(200);
        }
    }
    public void tauxIntérêtAnnuel(){
        Scanner tauxI = new Scanner(System.in);
        System.out.println("taux d'intérêt annuel: ");
        double tauxA = tauxI.nextDouble();
        tauxA = tauxA/100;
        System.out.println("Your new Solde is: " + (getSolde() - (getSolde()*tauxA)) + "DH");
    }

}

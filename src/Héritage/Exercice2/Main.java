package Héritage.Exercice2;

public class Main {
    public static void main(String[] args) {
        CompteBancaire Compte1 = new CompteBancaire(123456789, 500);
        Compte1.ajouter();
        Compte1.retirer();
        Compte1.afficher();
    }
}

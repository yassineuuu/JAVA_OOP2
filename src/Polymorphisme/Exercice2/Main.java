package Polymorphisme.Exercice2;

public class Main {
    public static void main(String[] args) {

        Bibliotheque BB = new Bibliotheque();

        Ouvrage Ouvrage1 = BB.ajoutOuvrage("BB", 1995, true);
        Ouvrage Ouvrage2 = BB.ajoutOuvrage("BB", 1995, true);
        System.out.println(Ouvrage1.afficher());
        System.out.println(Ouvrage2.afficher());
    }
}

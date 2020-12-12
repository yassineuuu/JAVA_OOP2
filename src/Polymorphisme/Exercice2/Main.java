package Polymorphisme.Exercice2;

public class Main {
    public static void main(String[] args) {

        Bibliotheque BB = new Bibliotheque();


//Ouvrages
        Ouvrage Ouvrage1 = BB.ajoutOuvrage("BB", 1995, true);
        Ouvrage Ouvrage2 = BB.ajoutOuvrage("BB", 1995, true);



        System.out.println(Ouvrage1.afficher());
        System.out.println(Ouvrage2.afficher());
        System.out.println();
        System.out.println(BB.objects);


        System.out.println("########################################################################################");


//Abonees
        Abonne Abonne1 = BB.ajoutAbonne(777, "Yassine", 12345, "GOT");
        Abonne Abonne2 = BB.ajoutAbonne(777, "Saad", 12346, "LOR");


        System.out.println(Abonne1.afficher());
        System.out.println(Abonne2.afficher());
    }
}

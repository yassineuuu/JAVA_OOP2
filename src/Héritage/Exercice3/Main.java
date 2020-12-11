package Héritage.Exercice3;

public class Main {

    public static void main(String[] args) {
        Secretaire Hasnaa = new Secretaire("Hasnaa", "Hasnaa",1995,"Ainchok","Casablanca","B1");
        Secretaire Hasnaa2 = new Secretaire("Hasnaa", "Hasnaa",1996,"Ainchok","Casablanca","B2");
        Secretaire Hasnaa3 = new Secretaire("Hasnaa", "Hasnaa",1996,"Ainchok","Casablanca","B3");

        Etudiant HasnaaE1 = new Etudiant("Hasnaa", "Hasnaa",1996,"Ainchok","Casablanca","D1");
        Etudiant HasnaaE2 = new Etudiant("Hasnaa", "Hasnaa",1996,"Ainchok","Casablanca","D2");




        Hasnaa.modifiePersonne("Ermel","Yousssoufia");
        System.out.println(Hasnaa.getAdresse());
        System.out.println(Hasnaa.getVille());

        System.out.println();

        System.out.println(Hasnaa.toString());

        Hasnaa.ecrirePersonne();

        System.out.println();

        System.out.println("Class Secretaire a " + Secretaire.getCount() + " Instances");
        System.out.println("Class Etudiant a " + Etudiant.getCount() + " Instances");


    }
}

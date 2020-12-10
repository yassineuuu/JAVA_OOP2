package Héritage.Exercice3;

public class Main {

    public static void main(String[] args) {
        Secretaire Hasnaa = new Secretaire("Hasnaa", "Hasnaa",1995,"Ainchok","Casablanca","B1");
        Hasnaa.modifiePersonne("Ermel","Yousssoufia");
        System.out.println(Hasnaa.getAdresse());
        System.out.println(Hasnaa.getVille());

        System.out.println();

        System.out.println(Hasnaa.toString());

        System.out.println(Hasnaa.ecrirePersonne());
    }
}

package Exercice1;

public class Main {
    public static void main(String[] args) {
        Employe Yassine = new Employe("MAKHLOUK", "Yassine", "Casablanca", 1995);
        System.out.println(Yassine.calculerAge());
        System.out.println("############################");
        Yassine.afficherInfosClient();
        System.out.println("############################");
    }



}

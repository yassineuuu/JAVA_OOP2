package Héritage.Exercice1;

public class Main {

    public static void main(String[] args) {
        Article Shoes = new Article("Shoes", 250);
        System.out.println(Shoes.afficher());

        System.out.println("###############################");
        ArticleEnSolde Sneakers = new ArticleEnSolde("Sneakers", 1600, 20);
        System.out.println("The price with réduction is " + Sneakers.afficher());
    }

}

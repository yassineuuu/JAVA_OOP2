package Héritage.Exercice1;


public class ArticleEnSolde extends Article{

    private int réduction;

    public ArticleEnSolde(String nom, int prix, int réduction) {
        super(nom, prix);
        this.réduction = réduction;
    }

    @Override
    public int afficher() {
        int percent = super.afficher()*réduction/100;
        return super.afficher() - percent;
    }
}

package Polymorphisme.Exercice2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotheque {

    ArrayList<String> Titres = new ArrayList<>();
    ArrayList<Integer> ID = new ArrayList<>();


//Method ajoutOuvrage qui permet d’ajouter un ouvrage dans la Liste, s’il n’existe pas
//déjà (la comparaison doit se faire sur le titre)
    public Ouvrage ajoutOuvrage(String titre, int dateDeCréation, boolean indicateur){

        if (!Titres.contains(titre)){
            Titres.add(titre);
            return new Ouvrage( titre, dateDeCréation, indicateur);
        }else {
            //if you kept using the same titre it will return you the Scanner
            Scanner newName = new Scanner(System.in);
            System.out.println("Ouvrage titre deja exist Utiliser un nouveau titre");
            String newTitre = newName.nextLine();
            if (!Titres.contains(newTitre)){
                Titres.add(newTitre);
                return new Ouvrage( newTitre, dateDeCréation, indicateur);
            }else {
                return ajoutOuvrage(titre, dateDeCréation, indicateur);
            }
        }
    }


//Method getOuvrage :
//    public String getOuvrage(String titre){
//        return Ouvrage.;
//    }


//Method ajoutAbonne
    public Abonne ajoutAbonne(int id, String nom, int numAbonnement, String ouvragePris){
        if (!ID.contains(id)){
            ID.add(id);
            return new Abonne( id, nom, numAbonnement, ouvragePris);
        }else {
            //if you kept using the same id it will return you the Scanner
            Scanner newId = new Scanner(System.in);
            System.out.println("Abonne id deja exist Utiliser un nouveau id");
            int newID = newId.nextInt();
            if (!ID.contains(newID)){
                ID.add(newID);
                return new Abonne( newID, nom, numAbonnement, ouvragePris);
            }else {
                return ajoutAbonne(id, nom, numAbonnement, ouvragePris);
            }
        }


    }


//Method getAbonne : qui prend comme paramètre un numéro d’identité et retourne
//l’abonné correspondant

}

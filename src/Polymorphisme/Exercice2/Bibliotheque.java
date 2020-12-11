package Polymorphisme.Exercice2;

import java.util.ArrayList;

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
            return null;
        }
    }


//Method getOuvrage :
//    public Ouvrage getOuvrage(String Title){
//        return Title.;
//    }


//Method ajoutAbonne
    public Abonne ajoutAbonne(int id, String nom, int numAbonnement, String ouvragePris){
        if (!ID.contains(id)){
            ID.add(id);
            return new Abonne( id, nom, numAbonnement, ouvragePris);
        }else {
            return null;
        }


    }


//Method getAbonne : qui prend comme paramètre un numéro d’identité et retourne
//l’abonné correspondant

}

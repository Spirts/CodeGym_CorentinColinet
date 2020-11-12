package fr.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Plus de 10 ? Ça ne va pas marcher.
*/

public class Solution {
    public static HashSet<Integer> creerSet() {
        // écris ton code ici
        HashSet<Integer> liste = new HashSet<Integer>();

        for(int i=0; i<20;i++){
            int x = (i+7-6)*2;
            liste.add(x);
        }

        return liste;
    }

    public static HashSet<Integer> supprimerNombresSuperieursA10(HashSet<Integer> ensemble) {
        // écris ton code ici
        HashSet<Integer> inferieurA10 = new HashSet<Integer>();

        Iterator<Integer> iterateur = ensemble.iterator();

        while (iterateur.hasNext())
        {
            int verif = iterateur.next();
            if (verif<=10){
                inferieurA10.add(verif);
            }
        }

        return inferieurA10;
    }

    public static void main(String[] args) {
    }
}

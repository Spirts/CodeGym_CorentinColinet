package fr.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
Liste de tableaux de nombres
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> liste = creerListe();
        imprimerListe(liste);
    }

    public static ArrayList<int[]> creerListe() {
        //écris ton code ici
        ArrayList<int[]> liste = new ArrayList<int[]>();

        int[] first = new int[5];
        for(int i=0;i<5;i++){
            first[i]=i+1;
        }
        int[] second = new int[2];
        for(int i=0;i<2;i++){
            second[i]=i+1;
        }
        int[] third = new int[4];
        for(int i=0;i<4;i++){
            third[i]=i+1;
        }
        int[] fourth = new int[7];
        for(int i=0;i<7;i++){
            fourth[i]=i+1;
        }
        int[] fifth = new int[0];

        liste.add(first);
        liste.add(second);
        liste.add(third);
        liste.add(fourth);
        liste.add(fifth);

        return liste;
    }

    public static void imprimerListe(ArrayList<int[]> liste) {
        for (int[] tableau : liste) {
            for (int x : tableau) {
                System.out.println(x);
            }
        }
    }
}

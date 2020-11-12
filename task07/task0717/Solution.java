package fr.codegym.task.task07.task0717;


import java.util.ArrayList;
import java.util.Scanner;

/* 
Duplication de mots
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        Scanner scan = new Scanner(System.in);
        ArrayList<String> liste = new ArrayList<String>();
        for(int i=0;i<10;i++){
            liste.add(scan.nextLine());
        }

        ArrayList<String> resultat = dupliquerValeurs(liste);

        // Display result
        for (String x : resultat){
            System.out.println(x);
        }

    }

    public static ArrayList<String> dupliquerValeurs(ArrayList<String> liste) {
        //écris ton code ici
        ArrayList<String> newListe = new ArrayList<String>();

        for(int i=0; i<liste.size();i++){
            newListe.add(liste.get(i));
            newListe.add(liste.get(i));
        }


        return newListe;
    }
}

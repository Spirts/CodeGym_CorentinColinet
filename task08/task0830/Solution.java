package fr.codegym.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Mission sur les algorithmes
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        String[] tableau = new String[20];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = lecteur.readLine();
        }

        tri(tableau);

        for (String x : tableau) {
            System.out.println(x);
        }
    }

    public static void tri(String[] tableau) {
        //écris ton code ici
        String s1 = "wtf?";
        String s2 = "what is the point?";

        estSuperieurA(s1,s2);

        Arrays.sort(tableau);
    }

    // Méthode de comparaison de chaînes : 'a' est supérieur à 'b'
    public static boolean estSuperieurA(String a, String b) {
        return a.compareTo(b) > 0;
    }
}

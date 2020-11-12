package fr.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Voyelles et consonnes
*/

public class Solution {
    public static char[] voyelles = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};

    public static void main(String[] args) throws Exception {
        // écris ton code ici
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        char[] str = s.toCharArray();
        ArrayList<Character> voy = new ArrayList<Character>();
        ArrayList<Character> cons = new ArrayList<Character>();
        for (char x : str){
            if(estVoyelle(x)){
                voy.add(x);
                voy.add(' ');
            } else if(!estVoyelle(x) && x!=' ' ) {
                cons.add(x);
                cons.add(' ');
            }
        }

        for(char x : voy){
            System.out.print(x);
        }
        System.out.println();
        for(char x : cons){
            System.out.print(x);
        }



    }

    // La méthode vérifie si une lettre est une voyelle
    public static boolean estVoyelle(char c) {
        c = Character.toLowerCase(c);  // Conversion en minuscules

        for (char d : voyelles)   // Recherche les voyelles dans le tableau
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
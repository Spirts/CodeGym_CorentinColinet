package fr.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Le plus petit de N nombres
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> listeEntiers = obtenirListeEntiers();
        System.out.println(obtenirMinimum(listeEntiers));
    }

    public static int obtenirMinimum(List<Integer> tableau) {
        // Trouve le minimum ici
        return Collections.min(tableau);
    }

    public static List<Integer> obtenirListeEntiers() throws IOException {
        // Crée et initialise une liste ici
        // Demander le nombre n
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Creer la liste
        List<Integer> entiers = new ArrayList<Integer>(n);

        // Alimenter la liste
        for(int i=n; i>0;i--){
            entiers.add(scan.nextInt());
        }

        //retour de la liste alimentée
        return entiers;
    }
}

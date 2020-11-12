package fr.codegym.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Cinq gagnants
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        int[] tableau = new int[20];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = Integer.parseInt(lecteur.readLine());
        }

        tri(tableau);

        System.out.println(tableau[0]);
        System.out.println(tableau[1]);
        System.out.println(tableau[2]);
        System.out.println(tableau[3]);
        System.out.println(tableau[4]);
    }

    public static void tri(int[] tableau) {
        //écris ton code ici
        ArrayList<Integer> listetri = new ArrayList<Integer>();
        for(int x : tableau){
            listetri.add(x);
        }
        Collections.sort(listetri);
        Collections.reverse(listetri);

        for(int i=0; i<tableau.length;i++){
            tableau[i]=listetri.get(i);
        }


    }
}

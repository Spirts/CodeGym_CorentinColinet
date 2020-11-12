package fr.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Par ordre décroissant
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        int[] tableau = new int[20];
        for (int i = 0; i < 20; i++) {
            tableau[i] = Integer.parseInt(lecteur.readLine());
        }

        tri(tableau);

        for (int x : tableau) {
            System.out.println(x);
        }
    }

    public static void tri(int[] tableau) {
        //écris ton code ici

        int [] tableauInv = new int[20];
        Arrays.sort(tableau);

        for(int i=19,j=0; i>=0 && j<=19 ; i--, j++){
            tableauInv[j]=tableau[i];
        }
        for (int i=0; i<20;i++){
            tableau[i]=tableauInv[i];
        }

    }
}

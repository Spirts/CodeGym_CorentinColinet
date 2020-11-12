package fr.codegym.task.task07.task0704;

import java.util.Arrays;
import java.util.Scanner;

/* 
Tournez tableau
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);

        int[] tableau = new int[10];

        for(int i=0;i<tableau.length;i++){
            tableau[i]=scan.nextInt();
        }

        for(int i=9;i>=0;i--){
            System.out.println(tableau[i]);
        }


    }
}


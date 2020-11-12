package fr.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Des rues et des maisons
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        int[] tableau = new int[15];
        int sommePair = 0, sommeImpair =0;


        for(int i=0;i<tableau.length;i++){
             tableau[i]=scan.nextInt();
        }

        for(int i=0;i<tableau.length;i+=2){
            sommePair += tableau[i];
        }

        for(int i=1;i<tableau.length;i+=2){
            sommeImpair += tableau[i];
        }

        if(sommeImpair>sommePair) {
            System.out.println("Les maisons à numéro impair ont plus de résidents.");
        } else {
            System.out.println("Les maisons à numéro pair ont plus de résidents.");
        }


    }
}

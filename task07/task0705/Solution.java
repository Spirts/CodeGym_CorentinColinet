package fr.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Un grand tableau et deux petits
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);

        int[] grandTableau = new int[20];
        int compteur;
        int[] petitTableau1 = new int[10];
        int[] petitTableau2 = new int[10];

        for (int i=0; i<20;i++){
            grandTableau[i]=scan.nextInt();
        }

        for (compteur = 0;compteur<10;compteur++){
            petitTableau1[compteur] = grandTableau[compteur];
        }
        for (compteur=0;compteur<10;compteur++){
            petitTableau2[compteur] = grandTableau[compteur+petitTableau2.length];
        }

        for(int i : petitTableau2){
            System.out.println(i);
        }
    }
}

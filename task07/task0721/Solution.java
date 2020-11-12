package fr.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Minimum et maximum dans les tableaux
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //écris ton code ici
        int[] nombres = new int[20];

        for(int i=0;i<20;i++){
            nombres[i]=Integer.parseInt(lecteur.readLine());
        }

        Arrays.sort(nombres);

        minimum = nombres[0];
        maximum = nombres[nombres.length-1];



        System.out.print(maximum + " " + minimum);
    }
}

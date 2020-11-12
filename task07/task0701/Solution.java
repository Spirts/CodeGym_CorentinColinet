package fr.codegym.task.task07.task0701;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/* 
Maximum dans un tableau
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] tableau = initialiserTableau();
        int max = max(tableau);
        System.out.println(max);
    }

    public static int[] initialiserTableau() throws IOException {
        // Create and populate the array
       int[] tableau = new int[20];

       Scanner scan = new Scanner(System.in);
       for(int i=0;i<20;i++){
           tableau[i]=scan.nextInt();
       }

        return tableau;
    }

    public static int max(int[] tableau) {
        // Find the maximum
        Arrays.sort(tableau);
        return tableau[19];
    }
}

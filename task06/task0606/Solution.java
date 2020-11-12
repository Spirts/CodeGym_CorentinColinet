package fr.codegym.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Chiffres pairs et impairs
*/

public class Solution {

    public static int pair = 0;
    public static int impair = 0;

    public static void main(String[] args) throws IOException {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        String sn = scan.nextLine();
        int n = Integer.parseInt(sn);

        int longueurNombre = sn.length();
        int chiffre;
        if (n < 0) {
            longueurNombre--;
        }

        for (int i =0; i<longueurNombre; i++){


            chiffre = n %10;

            if (chiffre %2 == 0)
                pair++;

            if (chiffre %2 == 1)
                impair++;


            n = n/10;
        }

        System.out.println("Pair : "+pair+" Impair : "+impair);

//écris ton code ici

    }
}

package fr.codegym.task.task04.task0441;


/* 
Plutôt moyen
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);

        int nb1 = scan.nextInt();
        int nb2 = scan.nextInt();
        int nb3 = scan.nextInt();

        do {

            if (nb1 > nb2) {
                int temp = nb1;
                nb1 = nb2;
                nb2 = temp;
            }

            if (nb2 > nb3) {
                int temp = nb2;
                nb2 = nb3;
                nb3 = temp;
            }

        }while(nb1>nb2 || nb2>nb3);


        System.out.println(nb2);

    }
}

package fr.codegym.task.task04.task0412;

/* 
Nombres positifs et négatifs
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        int nb = scan.nextInt();

        if (nb>0){
            System.out.println(nb*2);
        }
        if (nb<0){
            System.out.println(nb+1);
        }
        if (nb==0) {
            System.out.println(nb);
        }

    }

}
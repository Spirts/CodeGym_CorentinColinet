package fr.codegym.task.task04.task0442;


/* 
Ajout
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        int sum=0;

        while(true) {
            int nb = scan.nextInt();
            sum += nb;
            if(nb==-1){
                System.out.println(sum);
                break;
            }
        }

    }
}

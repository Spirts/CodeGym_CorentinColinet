package fr.codegym.task.task05.task0532;

import java.io.*;
import java.util.Scanner;

/* 
Mission sur les algorithmes
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int maximum = 0;

        //écris ton code ici
        int n = scan.nextInt();

        if(n>0) {
            maximum = scan.nextInt();

            for(int i = n; i>1; i--){
             int b = scan.nextInt();
             maximum = maximum>b ? maximum : b ;
            }

            System.out.println(maximum);
        }



    }
}

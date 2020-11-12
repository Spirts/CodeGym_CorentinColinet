package fr.codegym.task.task05.task0507;

/* 
Moyenne arithmétique
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        double sommeNum = 0.0 ;
        double moyenne = 0.0 ;
        double count = 0.0 ;

        while (true) {
            double nombre = scan.nextInt();

            if (nombre==-1)
                break;

            sommeNum += nombre;
            count++;
            moyenne = sommeNum / count;


        }
        System.out.println(moyenne);
    }
}


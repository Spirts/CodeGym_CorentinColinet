package fr.codegym.task.task04.task0443;


/* 
Un nom est un nom
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);


        String name = scan.nextLine();

        int aaaa = scan.nextInt();

        int mm = scan.nextInt();

        int jj = scan.nextInt();

        System.out.println("Je m'appelle "+name+".");
        System.out.println("Ma date de naissance est le "+jj+"/"+mm+"/"+aaaa);



    }
}

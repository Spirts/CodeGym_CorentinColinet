package fr.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Cochon tirelire dans la console
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int somme = 0;


        while(true){
            String s = scan.nextLine();
            if(s.equals("somme")) {
                System.out.println(somme);
                break;
            }
            int num = Integer.parseInt(s);
            somme += num;

        }

        //écris ton code ici
    }
}

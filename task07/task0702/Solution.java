package fr.codegym.task.task07.task0702;

import java.util.Scanner;

/* 
Tableau de chaînes en ordre inverse
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        String[] tableau = new String[10];
        for(int i=0;i<8;i++){
            tableau[i]=scan.nextLine();
        }

        for (int i=9;i>=0;i--){
            System.out.println(tableau[i]);
        }

    }
}
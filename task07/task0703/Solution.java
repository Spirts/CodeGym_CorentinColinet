package fr.codegym.task.task07.task0703;



/* 
Interactions entre tableaux isolés
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        String[] tabChaine = new String[10];
        int[] tabNum = new int[10];

        for(int i=0;i<tabChaine.length;i++){
            tabChaine[i]=scan.nextLine();
        }
        for(int i=0;i<tabChaine.length;i++){
            tabNum[i]=tabChaine[i].length();
        }

        for (int i : tabNum){
            System.out.println(i);
        }

    }
}

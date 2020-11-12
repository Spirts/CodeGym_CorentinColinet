package fr.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Mots inversés
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        ArrayList<String> chaines = new ArrayList<String>();

        for (int i=0 ; i<5 ; i++){
            chaines.add(scan.nextLine());
        }

        chaines.remove(2);

        for (int i=chaines.size()-1;i>=0;i--){
            System.out.println(chaines.get(i));
        }


    }
}



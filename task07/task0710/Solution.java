package fr.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Direction le sommet de la liste
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<String> chaines = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<10; i++){
            chaines.add(0, scan.nextLine());
        }

        for(String i : chaines){
            System.out.println(i);
        }

    }
}

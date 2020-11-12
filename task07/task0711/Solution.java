package fr.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Suppression et insertion
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        ArrayList<String> chaines = new ArrayList<String>();


        for(int i=0; i<5; i++){
            chaines.add(scan.nextLine());
        }


        for(int i=0; i<13;i++){
            chaines.add(0, chaines.get(4));
            chaines.remove(5);
        }


        for(String i : chaines){
            System.out.println(i);
        }

    }
}

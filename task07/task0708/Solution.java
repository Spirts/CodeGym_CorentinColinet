package fr.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
La chaîne la plus longue
*/

public class Solution {
    private static List<String> chaines;

    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        chaines = new ArrayList<String>();
        int stringMaxLength = 0;

        for(int i=0; i<5; i++){
            chaines.add(scan.nextLine());
        }

        for (int i=0; i<5; i++){
            if (stringMaxLength==0) {
                stringMaxLength = chaines.get(i).length();
            }
            if(chaines.get(i).length()>=stringMaxLength){
                stringMaxLength = chaines.get(i).length();
            }

        }

        for (int i=0; i<5; i++){
            if(chaines.get(i).length()==stringMaxLength){
                System.out.println(chaines.get(i));
            }
        }

    }
}

package fr.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Exprimons-nous de façon plus concise
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<String> table = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int stringMinLength=0;

        for(int i = 0; i<5; i++){
            table.add(scan.nextLine());
        }

        for (int i=0; i<5; i++){
            if (stringMinLength==0) {
                stringMinLength = table.get(i).length();
            }
            if(table.get(i).length()<=stringMinLength){
                stringMinLength = table.get(i).length();
            }

        }

        for (int i=0; i<5; i++){
            if(table.get(i).length()==stringMinLength){
                System.out.println(table.get(i));
            }
        }

    }
}

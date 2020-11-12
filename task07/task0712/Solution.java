package fr.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
La plus petite ou la plus longue chaîne
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<String> chaines = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int stringMaxLength=0;
        int stringMinLength=0;


        for(int i=0;i<10;i++){
            chaines.add(scan.nextLine());
        }

        // Determiner la longueur de la chaine la plus longue
        for (int i=0; i<10; i++){
            if (stringMaxLength==0) {
                stringMaxLength = chaines.get(i).length();
            }
            if(chaines.get(i).length()>=stringMaxLength){
                stringMaxLength = chaines.get(i).length();
            }
        }

        // Determiner la longueur de la chaine la plus courte
        for (int i=0; i<10; i++){
            if (stringMinLength==0) {
                stringMinLength = chaines.get(i).length();
            }
            if(chaines.get(i).length()<=stringMinLength){
                stringMinLength = chaines.get(i).length();
            }
        }

        // Prendre la premiere chaine qui correspond a l'une des longueurs

        for(int i=0; i<10;i++){
            if(chaines.get(i).length()==stringMaxLength || chaines.get(i).length()==stringMinLength){
                System.out.println(chaines.get(i));
                break;
            }
        }




    }
}

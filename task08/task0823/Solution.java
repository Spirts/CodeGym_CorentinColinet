package fr.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Expansion nationale
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        String s = lecteur.readLine();

        //écris ton code ici
        char[] phrase = s.toCharArray();

        for(int i = 0; i<phrase.length;i++){
            if(i==0){
                phrase[i]= Character.toUpperCase(phrase[i]);
            }

            if(phrase[i] == ' '){
            phrase[i+1] = Character.toUpperCase(phrase[i+1]);
            }

        }

        String message = String.valueOf(phrase);

        System.out.println(message);

    }
}

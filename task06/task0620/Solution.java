package fr.codegym.task.task06.task0620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Réparer les erreurs de la jeunesse
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        String max = "Le plus grand nombre est ";
        int a = Integer.parseInt(lecteur.readLine());
        int b = Integer.parseInt(lecteur.readLine());
        int numMax = a > b ? a : b;

        System.out.println(max + numMax);
    }

}

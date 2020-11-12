package fr.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Afficher des nombres en ordre inverse
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        //écris ton code ici
        ArrayList<Integer> nombres = new ArrayList<Integer>();

        for(int i=0; i<10;i++){
            int x = Integer.parseInt(lecteur.readLine());
            nombres.add(x);
        }

        for(int i=nombres.size()-1;i>=0;i--){
            System.out.println(nombres.get(i));
        }

    }
}

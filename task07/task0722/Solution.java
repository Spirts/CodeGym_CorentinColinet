package fr.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Fin
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        //écris ton code ici
        ArrayList<String> chaines = new ArrayList<String>();

        while (true) {
            String s;
            s = lecteur.readLine();
            if (s.equals("fin")) {
                break;
            } else {
                chaines.add(s);
            }
        }

        for (String x : chaines) {
            System.out.println(x);
        }
    }
}
package fr.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changement de fonctionnalité
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> liste = new ArrayList<String>();
        while (true) {
            String s = lecteur.readLine();
            if (s.isEmpty()) break;
            liste.add(s);
        }

        ArrayList<String> listeMajuscule = new ArrayList<String>();
        for (int i = 0; i < liste.size(); i++) {
            String s = liste.get(i);
            String sNew = "";
            if(s.length()%2 == 0){
                sNew = s+" "+s;
            }
            if(s.length()%2 == 1){
                sNew = s+" "+s + " "+s;
            }
            listeMajuscule.add(sNew);
        }

        for (int i = 0; i < listeMajuscule.size(); i++) {
            System.out.println(listeMajuscule.get(i));
        }
    }
}

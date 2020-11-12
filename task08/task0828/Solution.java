package fr.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Nombre du mois
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        HashMap<String, Integer> mois = new HashMap<String, Integer>();
        mois.put("Janvier",1);
        mois.put("Février",2);
        mois.put("Mars",3);
        mois.put("Avril",4);
        mois.put("Mai",5);
        mois.put("Juin",6);
        mois.put("Juillet",7);
        mois.put("Août",8);
        mois.put("Septembre",9);
        mois.put("Octobre",10);
        mois.put("Novembre",11);
        mois.put("Décembre",12);

        for(Map.Entry<String,Integer> x : mois.entrySet()){
            if(x.getKey().equals(s)){
                String sortieLettre = x.getKey();
                int sortieNombre = x.getValue();
                System.out.println(sortieLettre+" est le mois numéro "+sortieNombre);
            }
        }

    }
}

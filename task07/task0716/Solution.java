package fr.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R ou L
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("rose"); // 0
        liste.add("love"); // 1
        liste.add("lyre"); // 2
        liste = corriger(liste);

        for (String s : liste) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> corriger(ArrayList<String> liste) {
        // écris ton code ici
        ArrayList<String> correction = new ArrayList<String>();

        for(int i=0;i<liste.size();i++){
            if(liste.get(i).contains("l") && liste.get(i).contains("r")){
                correction.add(liste.get(i));
            } else if (liste.get(i).contains("l") && !liste.get(i).contains("r")){
                correction.add(liste.get(i));
                correction.add(liste.get(i));
            } else if (!liste.get(i).contains("l") && !liste.get(i).contains("r")) {
                correction.add(liste.get(i));
            }

        }
        return correction;
    }
}
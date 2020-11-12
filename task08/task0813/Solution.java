package fr.codegym.task.task08.task0813;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

/* 
20 mots qui commencent par la lettre « L »
*/

public class Solution {
    public static Set<String> creerSet() {
        //écris ton code ici
        Set<String> Lwords = new HashSet<String>();

        for(int i=0;i<20;i++){
            String s = "L" + i;
            Lwords.add(s);
        }

        return Lwords;

    }

    public static void main(String[] args) {

    }
}

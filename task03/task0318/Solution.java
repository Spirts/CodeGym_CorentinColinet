package fr.codegym.task.task03.task0318;

/* 
Plan de conquête du monde
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        
        String sAge = lecteur.readLine();
        int nAge = Integer.parseInt(sAge);
        
        String nom = lecteur.readLine();
        
        System.out.println(nom+" conquerra le monde dans "+nAge+" ans. Moua-ha-ha !");
        
        
    }
}

package fr.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Jouons à Javarella
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> donnees = new ArrayList<Integer>();
        for (int i = 0; i<20;i++){
          donnees.add(scan.nextInt());
        }

        ArrayList<Integer> div3 = new ArrayList<Integer>();
        ArrayList<Integer> div2 = new ArrayList<Integer>();
        ArrayList<Integer> others = new ArrayList<Integer>();

        for (int i = 0; i < donnees.size(); i++){

            if(donnees.get(i)%3 == 0){
                div3.add(donnees.get(i));
            }
            if(donnees.get(i)%2 == 0){
                div2.add(donnees.get(i));
            }
            if(donnees.get(i)%3 != 0 && donnees.get(i)%2 != 0){
                others.add(donnees.get(i));
            }
        }

        imprimerListe(div3);
        imprimerListe(div2);
        imprimerListe(others);


    }

    public static void imprimerListe(List<Integer> liste) {
        //écris ton code ici
        for(Integer x : liste){
            System.out.println(x);
        }
    }
}

package fr.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Mélange en temps opportun
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        //écris ton code ici
        int n = Integer.parseInt(lecteur.readLine());
        int m = Integer.parseInt(lecteur.readLine());

        ArrayList<String> chaines = new ArrayList<String>();

        for(int i=n; i>0;i--){
            chaines.add(lecteur.readLine());
        }

        for(int i=m; i>0;i--){
            chaines.add(chaines.get(0));
            chaines.remove(chaines.get(0));
        }

        for(String x : chaines){
            System.out.println(x);
        }


    }
}

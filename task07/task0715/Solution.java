package fr.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Sam-I-Am, le retour
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<String> chaines = new ArrayList<String>();
        chaines.add("Sam");
        chaines.add("I");
        chaines.add("Am");

        for(int i=0;i<chaines.size();i++)
        {
            if(chaines.get(i).equals("Sam") || chaines.get(i).equals("I") || chaines.get(i).equals("Am")  )
            chaines.add(i+1, "Ham");
        }

        for(String x : chaines){
            System.out.println(x);
        }
    }
}

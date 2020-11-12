package fr.codegym.task.task08.task0801;

/* 
HashSet de plantes
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        HashSet<String> ensemble = new HashSet<String>();

        ensemble.add("pastèque");
        ensemble.add("banane");
        ensemble.add("cerise");
        ensemble.add("poire");
        ensemble.add("melon");
        ensemble.add("mûre");
        ensemble.add("ginseng");
        ensemble.add("fraise");
        ensemble.add("iris");
        ensemble.add("pomme de terre");

        for(String x : ensemble){
            System.out.println(x);
        }

    }
}

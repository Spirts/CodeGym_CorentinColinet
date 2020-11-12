package fr.codegym.task.task08.task0802;

/* 
HashMap de 10 paires
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        HashMap<String, String> ensemble = new HashMap<String, String>();
        ensemble.put("pastèque","melon");
        ensemble.put("banane","fruit");
        ensemble.put("cerise","fruit");
        ensemble.put("poire","fruit");
        ensemble.put("melon","melon");
        ensemble.put("mûre","fruit");
        ensemble.put("ginseng","racine");
        ensemble.put("fraise","fruit");
        ensemble.put("iris","fleur");
        ensemble.put("pomme de terre","tubercule");

        for(Map.Entry<String, String> x : ensemble.entrySet()){
            String cle = x.getKey();
            String valeur = x.getValue();
            System.out.println(cle+" - "+valeur);
        }

    }
}

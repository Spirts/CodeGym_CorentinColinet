package fr.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Nous n'avons pas besoin de répétitions
*/

public class Solution {
    public static HashMap<String, String> creerMap() {
        //écris ton code ici
        HashMap<String, String> table = new HashMap<String, String>();
        table.put("test1","Joe");
        table.put("test2","Coco");
        table.put("test3","Clem");
        table.put("test4","Choupi");
        table.put("test5","Mounie");
        table.put("test6","Tom");
        table.put("test7","Tom");
        table.put("test8","Bob");
        table.put("test9","Bob");
        table.put("test10","Bob");
        return table;
    }

    public static void supprimerPrenomsIdentiques(Map<String, String> map) {
        //écris ton code ici
        HashMap<String, String> copie = new HashMap<String, String>(map);

        for(Map.Entry<String,String> paire : copie.entrySet()){
            int count = 0;
            for(Map.Entry<String,String> x : copie.entrySet()) {
                if(x.getValue().equals(paire.getValue())){
                    count++;
                }
                if(x.getValue().equals(paire.getValue()) && count > 1){
                    supprimerElementMapParValeur(map,x.getValue());
                }

            }

        }

    }

    public static void supprimerElementMapParValeur(Map<String, String> map, String valeur) {
        HashMap<String, String> copie = new HashMap<String, String>(map);
        for (Map.Entry<String, String> paire : copie.entrySet()) {
            if (paire.getValue().equals(valeur))
                map.remove(paire.getKey());
        }
    }

    public static void main(String[] args) {


    }
}

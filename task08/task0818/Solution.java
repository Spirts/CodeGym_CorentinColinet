package fr.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Réservé aux riches
*/

public class Solution {
    public static HashMap<String, Integer> creerMap() {
        //écris ton code ici
        HashMap<String, Integer> employes = new HashMap<String, Integer>();
        employes.put("Emp1", 1250);
        employes.put("Emp2", 1250);
        employes.put("Asupp1", 499);
        employes.put("Asupp2", 490);
        employes.put("Asupp3", 250);
        employes.put("Emp3", 1150);
        employes.put("Emp4", 1250);
        employes.put("Emp5", 1450);
        employes.put("Asupp4", 190);
        employes.put("Emp6", 1350);

        return employes;
    }

    public static void supprimerElementMap(HashMap<String, Integer> map) {
        //écris ton code ici
        HashMap<String,Integer> copie = new HashMap<>(map);

        for(Map.Entry<String,Integer> x : copie.entrySet()){
            String cle = x.getKey();
            Integer valeur = x.getValue();
            if(x.getValue()<500){
                map.remove(x.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
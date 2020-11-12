package fr.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Noms de famille et prénoms partagés
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = creerMapPersonnes();
        imprimerMapPersonnes(map);
    }

    public static Map<String, String> creerMapPersonnes() {
        //écris ton code ici
        HashMap<String, String> personnes = new HashMap<String, String>();

        personnes.put("pers1","personne1");
        personnes.put("pers2","personne2");
        personnes.put("pers3","personne3");
        personnes.put("pers","personne4");
        personnes.put("pers5","personne5");
        personnes.put("pers6","personne1");
        personnes.put("pers7","personne7");
        personnes.put("pers","personne8");
        personnes.put("pers9","personne3");
        personnes.put("pers10","personne1");
        return personnes;
    }

    public static void imprimerMapPersonnes(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

package fr.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Recensement
*/

public class Solution {
    public static HashMap<String, String> creerMap() {
        //écris ton code ici
        HashMap<String, String> listePersonnes = new HashMap<String, String>();
        listePersonnes.put("Colinet","Corentin");
        listePersonnes.put("Colinet1","Clémentine");
        listePersonnes.put("Colinet2","Alain");
        listePersonnes.put("Caufriez","Martine");
        listePersonnes.put("Caufriez1","Claire");
        listePersonnes.put("Pirson","Bernard");
        listePersonnes.put("Pirson1","Joe");
        listePersonnes.put("Doe","Joe");
        listePersonnes.put("Dang","Xavier");
        listePersonnes.put("Kong","Didi");

        return listePersonnes;

    }

    public static int obtenirNombrePrenomsIdentiques(HashMap<String, String> map, String nom) {
        //écris ton code ici
        Iterator<Map.Entry<String,String>> iterateur = map.entrySet().iterator();
        int count=0;

        while(iterateur.hasNext())
        {
        Map.Entry<String, String> paire = iterateur.next();
        String cle = paire.getKey();
        String valeur = paire.getValue();
            if(valeur.equals(nom)){
                count++;
            }
        }

        return count;
    }

    public static int obtenirNombreNomsIdentiques(HashMap<String, String> map, String nom) {
        //écris ton code ici
        Iterator<Map.Entry<String,String>> iterateur = map.entrySet().iterator();
        int count=0;

        while(iterateur.hasNext())
        {
            Map.Entry<String, String> paire = iterateur.next();
            String cle = paire.getKey();
            String valeur = paire.getValue();
            if(cle.equals(nom)){
                System.out.println(cle);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

    }
}

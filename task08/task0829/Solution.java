package fr.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Mise à jour logicielle
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        /*
        // Liste d'adresses => Creer une table dont le numéro de maison est l'index... et ajouter une famille tant que les entrées ne sont pas vides...
        List<String> adresses = new ArrayList<>();
        while (true) {
            String famille = lecteur.readLine();
            if (famille.isEmpty()) break;

            adresses.add(famille);
        }
         */

        //LOOP pour créer une combinaison Adresse(Ville) & Famille
        HashMap<String, String> adresseFamille = new HashMap<String, String>();

        while(true){
            String city = lecteur.readLine();
            if (city.isEmpty()) {
                break;
            }

            String famille = lecteur.readLine();
            if (famille.isEmpty()) {
                break;
            }

            adresseFamille.put(famille,city);
        }


        //LIT la FAMILLE, retourne la ville
        String laVille = lecteur.readLine();

        for(Map.Entry<String,String> x : adresseFamille.entrySet()){
            if(laVille.equals(x.getValue())){
                System.out.println(x.getKey());
            }
        }




        /*
        // Lit le numéro de la maison => l'index de la liste adresse...
        int numeroMaison = Integer.parseInt(lecteur.readLine());

        if (0 <= numeroMaison && numeroMaison < adresses.size()) {
            String nomFamille = adresses.get(numeroMaison);
            System.out.println(nomFamille);
        }
        */

    }
}

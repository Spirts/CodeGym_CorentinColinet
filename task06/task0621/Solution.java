package fr.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Relations avec les chats
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        String nomgrandPere = lecteur.readLine();
        Chat grandPere = new Chat(nomgrandPere);

        String nomgrandMere = lecteur.readLine();
        Chat grandMere = new Chat(nomgrandMere);

        String nomPere = lecteur.readLine();
        Chat pere = new Chat(grandPere,nomPere);

        String nomMere = lecteur.readLine();
        Chat mere = new Chat(nomMere,grandMere);

        String nomFils = lecteur.readLine();
        Chat fils = new Chat(nomFils,mere,pere);

        String nomFille = lecteur.readLine();
        Chat fille = new Chat(nomFille,mere,pere);

        System.out.println(grandPere);
        System.out.println(grandMere);
        System.out.println(pere);
        System.out.println(mere);
        System.out.println(fils);
        System.out.println(fille);
    }

    public static class Chat {
        private String nom;
        private Chat pere;
        private Chat mere;

        Chat(String nom) {
            this.nom = nom;
        }

        Chat(String nom, Chat mere) {
            this.nom = nom;
            this.mere = mere;
        }

        Chat(Chat pere,String nom) {
            this.nom = nom;
            this.pere = pere;
        }

        Chat(String nom, Chat mere, Chat pere) {
            this.nom = nom;
            this.mere = mere;
            this.pere = pere;
        }


        @Override
        public String toString() {
            if (pere == null && mere ==null)
                return "Le nom du chat est " + this.nom + ", pas de mère, pas de père";

            if (pere == null && mere != null )
                return "Le nom du chat est " + this.nom + ", " + mere.nom + " est sa mère, pas de père";

            if (pere != null && mere == null)
                return "Le nom du chat est " + this.nom + ", pas de mère, "+ pere.nom +" est son père";

            else
                return "Le nom du chat est " + this.nom + ", " + mere.nom + " est sa mère, "+ pere.nom + " est son père";
        }
    }

}

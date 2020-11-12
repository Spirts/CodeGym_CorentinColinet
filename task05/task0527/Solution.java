package fr.codegym.task.task05.task0527;

/* 
Tom et Jerry
*/

public class Solution {
    public static void main(String[] args) {
        Souris jerrySouris = new Souris("Jerry", 12, 5);
        Chat tomChat = new Chat("Tom",42,12);
        Chien fredChien = new Chien ("Fred",72,5);
        //écris ton code ici
    }

    public static class Souris {
        String nom;
        int taille;
        int queue;

        public Souris(String nom, int taille, int queue) {
            this.nom = nom;
            this.taille = taille;
            this.queue = queue;
        }
    }
    //écris ton code ici
    public static class Chat {
        private String nom;
        private int taille;
        private int queue;

        public Chat(String nom, int taille, int queue) {
            this.nom = nom;
            this.taille = taille;
            this.queue = queue;
        }
    }

    public static class Chien {
        private String nom;
        private int taille;
        private int queue;

        public Chien(String nom, int taille, int queue) {
            this.nom = nom;
            this.taille = taille;
            this.queue = queue;
        }
    }
}

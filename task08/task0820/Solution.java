package fr.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Ensemble d'animaux
*/

public class Solution {
    public static void main(String[] args) {
        Set<Chat> chats = creerChats();
        Set<Chien> chiens = creerChiens();

        Set<Object> animaux = jointure(chats, chiens);
        imprimerAnimaux(animaux);

        supprimerChats(animaux, chats);
        imprimerAnimaux(animaux);
    }

    public static Set<Chat> creerChats() {
        HashSet<Chat> resultat = new HashSet<Chat>();

        //écris ton code ici
        for(int i=0; i<4;i++){
            Chat chat = new Chat();
            resultat.add(chat);
        }

        return resultat;
    }

    public static Set<Chien> creerChiens() {
        //écris ton code ici
        HashSet<Chien> resultat = new HashSet<Chien>();

        for(int i=0; i<3;i++){
            Chien chien = new Chien();
            resultat.add(chien);
        }

        return resultat;
    }

    public static Set<Object> jointure(Set<Chat> chats, Set<Chien> chiens) {
        //écris ton code ici
        HashSet<Object> joined = new HashSet<Object>();
        joined.addAll(chats);
        joined.addAll(chiens);

        return joined;
    }

    public static void supprimerChats(Set<Object> animaux, Set<Chat> chats) {
        //écris ton code ici
        animaux.removeAll(chats);
    }

    public static void imprimerAnimaux(Set<Object> animaux) {
        //écris ton code ici
        for(Object x : animaux){
            System.out.println(x);
        }
    }

    //écris ton code ici
    public static class Chat{

    }

    public static class Chien{

    }

}

package fr.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Ensemble de chats
*/

public class Solution {
    public static void main(String[] args) {
        Set<Chat> chats = creerChats();
        //écris ton code ici. Étape 3
        Chat aSupprimer = new Chat();

        assert chats != null;
        for(Chat x : chats){
            aSupprimer = x;
        }

        chats.remove(aSupprimer);

        imprimerChats(chats);
    }

    public static Set<Chat> creerChats() {
        //écris ton code ici. Étape 2
        Set<Chat> addChats = new HashSet<Chat>();
        Chat chat1 = new Chat();
        addChats.add(chat1);
        Chat chat2 = new Chat();
        addChats.add(chat2);
        Chat chat3 = new Chat();
        addChats.add(chat3);
        return addChats;
    }

    public static void imprimerChats(Set<Chat> chats) {
        // Étape 4
        for (Chat x : chats) {
            System.out.println(x);
        }
    }

    // Étape 1
    public static class Chat {

    }

}

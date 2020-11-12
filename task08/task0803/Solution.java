package fr.codegym.task.task08.task0803;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
HashMap de chats
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] chats = new String[]{"Tiger", "Missy", "Smokey", "Marmalade", "Oscar", "Snowball", "Boss", "Smudge", "Max", "Simba"};

        HashMap<String, Chat> map = ajouterChatsAMap(chats);

        for (Map.Entry<String, Chat> paire : map.entrySet()) {
            System.out.println(paire.getKey() + " - " + paire.getValue());
        }
    }


    public static HashMap<String, Chat> ajouterChatsAMap(String[] chats) {
        //écris ton code ici
        HashMap<String, Chat> ensembleChats = new HashMap<String, Chat>();


        for (int i=0;i< chats.length;i++){
            Chat chat = new Chat(chats[i]);
            ensembleChats.put(chats[i], chat);
        }
        return ensembleChats;

    }


    public static class Chat {
        String nom;

        public Chat(String nom) {
            this.nom = nom;
        }

        @Override
        public String toString() {
            return nom != null ? nom.toUpperCase() : null;
        }
    }
}

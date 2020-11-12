package fr.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Dix chats
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Chat> map = creerMap();
        Set<Chat> ensemble = convertirMapEnSet(map);
        imprimerSetChats(ensemble);
    }

    public static Map<String, Chat> creerMap() {
        //écris ton code ici
        HashMap<String, Chat> mapChats = new HashMap<String, Chat>();
        mapChats.put("chat1",new Chat("Félix"));
        mapChats.put("chat2",new Chat("Bidouche"));
        mapChats.put("chat3",new Chat("Copain"));
        mapChats.put("chat4",new Chat("Illidan"));
        mapChats.put("chat5",new Chat("Bigglesworth"));
        mapChats.put("chat6",new Chat("Chaussette"));
        mapChats.put("chat7",new Chat("Kittler"));
        mapChats.put("chat8",new Chat("Batman"));
        mapChats.put("chat9",new Chat("LeChat"));
        mapChats.put("chat10",new Chat("Beh"));

        return mapChats;

    }

    public static Set<Chat> convertirMapEnSet(Map<String, Chat> map) {
        //écris ton code ici
        HashSet<Chat> setChats = new HashSet<Chat>();
        for(Map.Entry<String,Chat> x : map.entrySet()){
            setChats.add(x.getValue());
        }
        return setChats;
    }

    public static void imprimerSetChats(Set<Chat> ensemble) {
        for (Chat chat : ensemble) {
            System.out.println(chat);
        }
    }

    public static class Chat {
        private String nom;

        public Chat(String nom) {
            this.nom = nom;
        }

        public String toString() {
            return "Chat " + this.nom;
        }
    }


}

package fr.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Chats static
*/

public class Chat {
    //écris ton code ici
    public static ArrayList<Chat> chats = new ArrayList<Chat>();

    public Chat() {
    }

    public static void main(String[] args) {
        //écris ton code ici
        for(int i=10;i>0;i--) {
            Chat chat1 = new Chat();
            chats.add(chat1);
        }
        imprimerChats();
    }

    public static void imprimerChats() {
        //écris ton code ici
        for( Chat i : chats){
            System.out.println(i);
        }
    }
}

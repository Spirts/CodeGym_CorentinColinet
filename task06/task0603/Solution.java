package fr.codegym.task.task06.task0603;

/* 
Objets Chat et Chien : 50 000 de chaque
*/

public class Solution {
    public static void main(String[] args) {
        // écris ton code ici
        for (long i=50000; i>0;i--){
            Chat chat = new Chat();
        }
        for (long i=50000; i>0;i--){
            Chien chien = new Chien();
        }

    }
}

class Chat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Un Chat a été détruit");
    }
}

class Chien {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Un Chien a été détruit");
    }
}

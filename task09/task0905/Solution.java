package fr.codegym.task.task09.task0905;

/* 
Dans les profondeurs bleues de la trace de pile...
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int profondeur = obtenirProfondeurTracePile();
    }

    public static int obtenirProfondeurTracePile() {
        // écris ton code ici
        int length = Thread.currentThread().getStackTrace().length;
        System.out.println(length);
        return length;
    }
}


package fr.codegym.task.task09.task0906;

/* 
Enregistrement des traces de pile
*/

public class Solution {
    public static void main(String[] args) {
        journaliser("Dans la méthode main");
    }

    public static void journaliser(String s) {
        //écris ton code ici
        String classe = Thread.currentThread().getStackTrace()[2].getClassName();
        String methode = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(classe+": "+methode+": "+s);
    }
}

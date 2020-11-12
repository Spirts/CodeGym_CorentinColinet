package fr.codegym.task.task01.task0132;

/* 
Somme des chiffres d'un nombre à trois chiffres
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sommeChiffresDeNombre(546));
    }

    public static int sommeChiffresDeNombre(int nombre) {
        //écris ton code ici
        int nb1 = nombre/100;

        int nb2 = (nombre/10)-(nb1*10);

        int nb3 = nombre - (nb1*100) - (nb2*10);

        return nb1+nb2+nb3;
    }
}
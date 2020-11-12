package fr.codegym.task.task07.task0723;

/* 
Compte à rebours
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
            //écris ton code ici
        }

        System.out.println("Boum !");
    }
}

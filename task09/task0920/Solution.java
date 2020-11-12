package fr.codegym.task.task09.task0920;

/* 
Compte à rebours
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Le programme a été interrompu");
            }
            //écris ton code ici
        }
    }
}

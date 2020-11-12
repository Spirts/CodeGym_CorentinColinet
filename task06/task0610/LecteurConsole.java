package fr.codegym.task.task06.task0610;


/* 
Classe LecteurConsole
*/

import java.util.Scanner;

public class LecteurConsole {
    public static String lireString() throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int lireInt() throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static double lireDouble() throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static boolean lireBoolean() throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        return scan.nextBoolean();
    }

    public static void main(String[] args) {

    }
}

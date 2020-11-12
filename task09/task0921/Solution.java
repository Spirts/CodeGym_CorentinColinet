package fr.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/* 
Méthode dans un try-catch
*/

public class Solution {
    public static void main(String[] args) {
        lireDonnees();
    }

    public static void lireDonnees() {
        //écris ton code ici
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        try {
            Scanner scan = new Scanner(System.in);
            while (true) {
                int x = scan.nextInt();
                numbers.add(x);
            }
        } catch (InputMismatchException e) {
            for(int x : numbers){
                System.out.println(x);
            }
        }

    }
}

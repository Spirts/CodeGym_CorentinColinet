package fr.codegym.task.task05.task0531;

/* 
Amélioration de fonctionnalité
*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e)
    {
        int[] numbers = {a,b,c,d,e};
        Arrays.sort(numbers);
        return numbers[0];
    }
}

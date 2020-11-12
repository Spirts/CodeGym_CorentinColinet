package fr.codegym.task.task09.task0919;

/*
Division par zéro
*/

public class Solution {

    public static void main(String[] args) {
        try {
            diviserParZero();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void diviserParZero() {
        int x = 99 / 0;
        System.out.println(x);
    }
}
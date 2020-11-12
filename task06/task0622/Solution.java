package fr.codegym.task.task06.task0622;

/*
Chiffres croissants
*/


import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[] numbers = { 0, 0, 0, 0, 0};

        for(int i=0;i<5;i++){
            numbers[i]=scan.nextInt();
        }

        Arrays.sort(numbers);

        for( int i : numbers){
            System.out.println(i);
        }



        //écris ton code ici
    }
}

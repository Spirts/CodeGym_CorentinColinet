package fr.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
La plus longue séquence
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //écris ton code ici
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<10;i++){
            list.add(scan.nextInt());
        }

        int checkNum = list.get(0);
        int count = 1;
        int maxCount = 1;


        for(int i=1; i<10;i++){
            if(list.get(i)==checkNum){
            count++;
            }

            if (list.get(i)!=checkNum){
            checkNum = list.get(i);

                if(maxCount>count){
                    count=1;
                }

                if(maxCount == count){
                    count =1;
                }

                if(maxCount<count){
                    maxCount=count;
                    count=1;
                }
            }
        }

        if(maxCount<count){
            maxCount=count;
        }

        System.out.println(maxCount);



    }
}

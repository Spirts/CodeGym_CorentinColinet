package fr.codegym.task.task07.task0718;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Vérification d'ordre
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        ArrayList<String> chaines = new ArrayList<String>();
        for(int i=0; i<10;i++){
            chaines.add(scan.nextLine());
        }

        for(int i=0; i<chaines.size()-1;i++){
            if(chaines.get(i).length() > chaines.get(i+1).length()){
                System.out.println(i+1);
                break;
            }
        }


    }
}


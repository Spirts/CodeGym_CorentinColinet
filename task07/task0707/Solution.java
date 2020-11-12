package fr.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
Qu'est-ce que c'est que cette liste ?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<String> table = new ArrayList<String>();
        table.add("Truc");
        table.add("Truc1");
        table.add("Truc2");
        table.add("Truc3");
        table.add("Truc4");
        System.out.println(table.size());
        for (String i : table){
            System.out.println(i);
        }
    }
}

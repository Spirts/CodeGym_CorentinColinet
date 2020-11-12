package fr.codegym.task.task05.task0528;

/* 
Afficher la date d'aujourd'hui
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("MM dd yyyy");
        String stringDate = DateFor.format(date);
        System.out.println(stringDate);
    }
}

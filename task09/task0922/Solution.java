package fr.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Quelle est la date d'aujourd'hui ?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        Date today = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(s);

        SimpleDateFormat todayFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        System.out.println(todayFormat.format(today).toUpperCase());



    }
}

package fr.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
La gentille Emma et les vacances d'été
*/

public class Solution {
    public static HashMap<String, Date> creerMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //écris ton code ici
        map.put("Test1",df.parse("JANUARY 18 1990"));
        map.put("Test2",df.parse("JANUARY 18 1990"));
        map.put("Test3",df.parse("AUGUST 31 1990"));
        map.put("Test4",df.parse("JULY 15 1990"));
        map.put("Test5",df.parse("JULY 15 1990"));
        map.put("Test6",df.parse("JULY 15 1990"));
        map.put("Test7",df.parse("JULY 15 1990"));
        map.put("Test8",df.parse("JULY 15 1990"));
        map.put("Test9",df.parse("JULY 15 1990"));
        return map;
    }

    public static void supprimerToutesPersonnesEte(HashMap<String, Date> map) {
        //écris ton code ici
        Iterator<Map.Entry<String, Date>> iterateur = map.entrySet().iterator();
        while(iterateur.hasNext())
        {
            Map.Entry<String, Date> paire = iterateur.next();
            int month = paire.getValue().getMonth();
            String key = paire.getKey();
            if (month >= 5 && month <= 7){
                iterateur.remove();
            }
        }

    }

    public static void main(String[] args) throws ParseException {

    }
}

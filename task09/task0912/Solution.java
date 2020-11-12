package fr.codegym.task.task09.task0912;

/* 
Exception lorsque tu travailles avec des nombres
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        //écris ton code ici
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}

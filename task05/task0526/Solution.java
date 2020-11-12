package fr.codegym.task.task05.task0526;

/* 
Hommes et femmes
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici

        Homme homme1 = new Homme("Fred",42,"Jouis en Jausace");
        Homme homme2 = new Homme("José",42,"Jouis en Jausace");
        Femme femme1 = new Femme("Gertrude", 42,"Moncuq");
        Femme femme2 = new Femme("Cunégonde", 42,"Moncuq");
        System.out.println(homme1);
        System.out.println(homme2);
        System.out.println(femme1);
        System.out.println(femme2);
    }

    //écris ton code ici
    public static class Homme{
        private String nom;
        private int age;
        private String adresse;

        public Homme(String nom, int age, String adresse) {
            this.nom = nom;
            this.age = age;
            this.adresse = adresse;
        }

        public String toString(){
            return nom+" "+age+" "+adresse;
        }
    }

    public static class Femme {
        private String nom;
        private int age;
        private String adresse;

        public Femme(String nom, int age, String adresse) {
            this.nom = nom;
            this.age = age;
            this.adresse = adresse;
        }


        public String toString(){
            return nom+" "+age+" "+adresse;
        }
    }
}

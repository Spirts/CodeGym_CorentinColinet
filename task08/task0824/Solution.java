package fr.codegym.task.task08.task0824;

/* 
Créons une famille
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        Humain enfant1 = new Humain("Enfant1", true, 18);
        Humain enfant2 = new Humain("Enfant2", false, 17);
        Humain enfant3 = new Humain("Enfant3", false, 14);


        Humain pere = new Humain("Pere", true, 45, enfant1, enfant2, enfant3);
        Humain mere = new Humain("Mere", false, 38, enfant1, enfant2, enfant3);

        Humain grandpere1 = new Humain("GPpere", true,88, pere);
        Humain grandpere2 = new Humain("GPmere",true, 85, mere);
        Humain grandmere1 = new Humain("GMpere", false, 86, pere);
        Humain grandmere2 = new Humain("GMmere", false, 83, mere);

        System.out.println(grandpere1);
        System.out.println(grandmere1);
        System.out.println(pere);

        System.out.println(grandpere2);
        System.out.println(grandmere2);
        System.out.println(mere);

        System.out.println(enfant1);
        System.out.println(enfant2);
        System.out.println(enfant3);


    }

    public static class Humain {
        //écris ton code ici
        String nom;
        boolean sexe;
        int age;
        ArrayList<Humain> enfants = new ArrayList<Humain>();

        public Humain(String nom, boolean sexe, int age, Humain enfant1) {
            this.nom = nom;
            this.sexe = sexe;
            this.age = age;
            this.enfants.add(enfant1);
        }

        public Humain(String nom, boolean sexe, int age, Humain enfant1, Humain enfant2) {
            this.nom = nom;
            this.sexe = sexe;
            this.age = age;
            this.enfants.add(enfant1);
            this.enfants.add(enfant2);
        }

        public Humain(String nom, boolean sexe, int age, Humain enfant1, Humain enfant2, Humain enfant3) {
            this.nom = nom;
            this.sexe = sexe;
            this.age = age;
            this.enfants.add(enfant1);
            this.enfants.add(enfant2);
            this.enfants.add(enfant3);
        }

        public Humain(String nom, boolean sexe, int age) {
            this.nom = nom;
            this.sexe = sexe;
            this.age = age;
        }

        public String toString() {
            String texte = "";
            texte += "Nom : " + this.nom;
            texte += ", sexe : " + (this.sexe ? "masculin" : "féminin");
            texte += ", âge : " + this.age;

            int nombreEnfants = this.enfants.size();
            if (nombreEnfants > 0) {
                texte += ", enfants : " + this.enfants.get(0).nom;

                for (int i = 1; i < nombreEnfants; i++) {
                    Humain enfant = this.enfants.get(i);
                    texte += ", " + enfant.nom;
                }
            }
            return texte;
        }
    }

}

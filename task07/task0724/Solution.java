package fr.codegym.task.task07.task0724;

/* 
Arbre généalogique
*/

public class Solution {
    public static void main(String[] args) {
        // écris ton code ici
        Humain grandPere1 = new Humain("Hubert",true, 80);
        Humain grandPere2 = new Humain("Bertrand", true, 88);

        Humain grandMere1 = new Humain("Josiane", false, 78);
        Humain grandMere2 = new Humain("Bianca",false, 85);

        Humain pere = new Humain("Robert",true, 45, grandPere1, grandMere1);
        Humain mere = new Humain("Sonia", false, 41, grandPere2, grandMere2);

        Humain enfant1 = new Humain ( "Minone",true, 18,pere,mere);
        Humain enfant2 = new Humain ( "Mintwo",false, 17,pere,mere);
        Humain enfant3 = new Humain ( "Minthree",false, 16,pere,mere);

        System.out.println(grandPere1);
        System.out.println(grandPere2);
        System.out.println(grandMere1);
        System.out.println(grandMere2);
        System.out.println(pere);
        System.out.println(mere);
        System.out.println(enfant1);
        System.out.println(enfant2);
        System.out.println(enfant3);
    }

    public static class Humain {
        // écris ton code ici
        String nom;
        boolean sexe;
        int age;
        Humain pere;
        Humain mere;


        public Humain(String nom, boolean sexe, int age) {
            this.nom = nom;
            this.sexe = sexe;
            this.age = age;
        }

        public Humain(String nom, boolean sexe, int age, Humain pere, Humain mere) {
            this.nom = nom;
            this.sexe = sexe;
            this.age = age;
            this.pere = pere;
            this.mere = mere;
        }

        public String toString() {
            String texte = "";
            texte += "Nom : " + this.nom;
            texte += ", sexe : " + (this.sexe ? "masculin" : "féminin");
            texte += ", âge : " + this.age;

            if (this.pere != null)
                texte += ", père : " + this.pere.nom;

            if (this.mere != null)
                texte += ", mère : " + this.mere.nom;

            return texte;
        }
    }
}
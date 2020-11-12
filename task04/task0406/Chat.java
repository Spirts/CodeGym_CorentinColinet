package fr.codegym.task.task04.task0406;

/* 
Registre de noms
*/

public class Chat {

    private String nomComplet;

    public void definirNom(String prenom, String nom) {
        String nomComplet = prenom + " " + nom;
        System.out.println(nomComplet);
        //écris ton code ici
        this.nomComplet = nomComplet;
    }

    public static void main(String[] args) {
        Chat felix = new Chat();
        felix.definirNom("Felix","Deushleuh");
    }
}

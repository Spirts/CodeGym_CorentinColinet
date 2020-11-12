package fr.codegym.task.task06.task0602;

/* 
Chats zombies, chiens zombies
*/

public class Chat {
    public static void main(String[] args) {

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Un Chat a été détruit");
        super.finalize();
    }
    //écris ton code ici

}

class Chien {
    //écris ton code ici


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Un Chien a été détruit");
        super.finalize();
    }
}

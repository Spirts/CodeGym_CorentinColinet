package fr.codegym.task.task09.task0918;

/* 
Nous sommes tous amis ici, même les exceptions
*/

public class Solution {
    public static void main(String[] args) {
    }

    static class MonException extends Throwable{
    }

    static class MonException2 extends ClassNotFoundException{
    }

    static class MonException3 extends RuntimeException{
    }

    static class MonException4 extends IllegalStateException{
    }
}


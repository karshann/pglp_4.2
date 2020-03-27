package org.example;

public class PileException extends Exception {

    PileException()
    {
        super("Pas assez d'opérandes dans la pile.");
    }
}

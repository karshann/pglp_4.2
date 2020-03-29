package org.example;

public class OutOfBoundsException extends Exception {

    /**
     * Exception qui permet de gerer les valeurs
     * que le programme ne peut pas traitée.
     */
    public OutOfBoundsException() {
        super(" Valeur ne peut être traité.");
    }


}


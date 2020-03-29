package org.example;

import java.util.Stack;

public class CommandeRetourner implements Commande {
    /**
     *
     */
    private MoteurRPN moteurRPN;
    /**
     *
     */
    private Stack<Double> pile;

    /**
     *
     * @param moteur
     */
    public CommandeRetourner(MoteurRPN moteur) {
        this.moteurRPN = moteur;
    }

    /**
     *
     */
    @Override
    public void execute() {

        this.pile = this.moteurRPN.getPileact();
    }
}

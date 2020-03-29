package org.example;

import java.util.Stack;

public class CommandeCalcul implements Commande {
    /**
     *
     */
    private MoteurRPN moteurRPN;
    /**
     *
     */
    private Operation operation;

    /**
     *
     * @param moteur
     * @param operation
     */
    public CommandeCalcul(MoteurRPN moteur, Operation operation) {
        this.moteurRPN = moteur;
        this.operation = operation;
    }

    /**
     *
     * @param operation
     */
    public void setOperation(Operation operation) {
        this.operation = operation;

    }

    /**
     *
     */
    @Override
    public void execute() {
        double d = 0;
        if (this.moteurRPN.getPileact().size() > 1) {
            this.moteurRPN.setPilePrec((Stack<Double>) this.moteurRPN.getPileact().clone());
            d = operation.eval(this.moteurRPN.getPileact().pop(), this.moteurRPN.getPileact().pop());
            this.moteurRPN.getPileact().push(d);
        }
    }

}
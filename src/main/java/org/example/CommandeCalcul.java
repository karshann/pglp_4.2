package org.example;


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
    public void execute() throws OutOfBoundsException {
       this.moteurRPN.Application(this.operation);
        this.moteurRPN.affichepile();
    }

}
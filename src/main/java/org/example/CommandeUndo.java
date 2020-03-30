package org.example;

public class CommandeUndo implements Commande {
    /**
     *
     */
    private MoteurRPN moteurRPN;

    /**
     *
     * @param moteurRPN
     */
    public CommandeUndo(MoteurRPN moteurRPN) {
        this.moteurRPN = moteurRPN;
    }

    /**
     *
     */
    @Override
    public void execute() {
        this.moteurRPN.undo();
        this.moteurRPN.affichepile();
    }
}

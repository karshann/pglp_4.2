package org.example;

public class CommandeUndo implements Commande {
    /**
     *
     */
    private Interpreteur inter;

    /**
     *
     * @param inter
     */
    public CommandeUndo(Interpreteur inter) {
        this.inter = inter;
    }

    /**
     *
     */
    @Override
    public void execute() {
        this.inter.undo();
    }
}

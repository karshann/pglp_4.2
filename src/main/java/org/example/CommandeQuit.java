package org.example;

public class CommandeQuit implements Commande {
    /**
     *
     */
    private Interpreteur Int;

    /**
     *
     * @param Interpreteur
     */
    public CommandeQuit(Interpreteur Interpreteur) {
        this.Int = Interpreteur;

    }

    /**
     *
     */
    @Override
    public void execute() {
        this.Int.quitter();

    }

}